package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.sheets.WorkbookData;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("请输入 JSON 文件路径: ");

        String jsonFilePath;
        try (Scanner scanner = new Scanner(System.in)) {
            jsonFilePath = scanner.nextLine();
        }
        if (jsonFilePath == null || jsonFilePath.trim().isEmpty()) {
            System.err.println("文件路径不能为空。");
            return;
        }
        jsonFilePath = jsonFilePath.trim();

        try {
            // 读取并解析JSON文件为WorkbookData对象
            WorkbookData workbookData = readWorkbookFromJson(jsonFilePath);

            // 输出解析结果
            System.out.println("成功解析工作簿数据:");
            System.out.println("ID: " + workbookData.getId());
            System.out.println("版本: " + workbookData.getAppVersion());
            System.out.println("语言环境: " + workbookData.getLocale());
            System.out.println("样式数量: " + (workbookData.getStyles() != null ? workbookData.getStyles().size() : 0));
            System.out.println("工作表数量: " + (workbookData.getSheets() != null ? workbookData.getSheets().size() : 0));

            // 打印工作簿自定义字段
            if (workbookData.getCustom() != null && !workbookData.getCustom().isEmpty()) {
                System.out.println("\n=== 工作簿自定义字段 ===");
                printCustomFields(workbookData.getCustom(), "工作簿");
            }

            // 详细打印工作表信息
            if (workbookData.getSheets() != null && !workbookData.getSheets().isEmpty()) {
                System.out.println("\n=== 工作表详细信息 ===");
                workbookData.getSheets().forEach((sheetId, worksheetData) -> {
                    printWorksheetDetails(worksheetData);
                });
            }

        } catch (IOException e) {
            System.err.println("读取文件时发生错误: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("解析JSON时发生错误: " + e.getMessage());
        }
    }

    /**
     * 从指定路径读取JSON文件并解析为WorkbookData对象
     * 
     * @param jsonFilePath JSON文件路径
     * @return 解析后的WorkbookData对象
     * @throws IOException 文件读取异常
     */
    public static WorkbookData readWorkbookFromJson(String jsonFilePath) throws IOException {
        // 检查文件是否存在
        File jsonFile = new File(jsonFilePath);
        if (!jsonFile.exists()) {
            throw new IOException("文件不存在: " + jsonFilePath);
        }

        if (!jsonFile.isFile()) {
            throw new IOException("路径不是文件: " + jsonFilePath);
        }

        // 创建ObjectMapper实例
        ObjectMapper objectMapper = new ObjectMapper();

        // 读取并解析JSON文件
        return objectMapper.readValue(jsonFile, WorkbookData.class);
    }

    /**
     * 详细打印工作表信息
     * 
     * @param worksheetData 工作表数据
     */
    private static void printWorksheetDetails(org.example.sheets.WorksheetData worksheetData) {
        System.out.println("\n--- 工作表: " + worksheetData.getName() + " ---");
        System.out.println("ID: " + worksheetData.getId());
        System.out.println("行数: " + (worksheetData.getRowCount() != null ? worksheetData.getRowCount() : "未设置"));
        System.out.println("列数: " + (worksheetData.getColumnCount() != null ? worksheetData.getColumnCount() : "未设置"));

        // 打印合并单元格信息
        if (worksheetData.getMergeData() != null && !worksheetData.getMergeData().isEmpty()) {
            System.out.println("合并单元格数量: " + worksheetData.getMergeData().size());
        }

        // 打印单元格数据统计
        if (worksheetData.getCellData() != null && !worksheetData.getCellData().isEmpty()) {
            int totalCells = worksheetData.getCellData().values().stream()
                    .mapToInt(Map::size)
                    .sum();
            System.out.println("有数据的单元格数量: " + totalCells);
        }

        // 打印工作表自定义字段
        if (worksheetData.getCustom() != null && !worksheetData.getCustom().isEmpty()) {
            System.out.println("自定义字段数量: " + worksheetData.getCustom().size());
            printCustomFields(worksheetData.getCustom(), "工作表");
        }

        // 打印行数据统计和自定义字段
        if (worksheetData.getRowData() != null && !worksheetData.getRowData().isEmpty()) {
            System.out.println("有样式的行数量: " + worksheetData.getRowData().size());
            printRowDataCustomFields(worksheetData.getRowData());
        }

        // 打印列数据统计和自定义字段
        if (worksheetData.getColumnData() != null && !worksheetData.getColumnData().isEmpty()) {
            System.out.println("有样式的列数量: " + worksheetData.getColumnData().size());
            printColumnDataCustomFields(worksheetData.getColumnData());
        }

    }

    /**
     * 打印自定义字段信息
     * 
     * @param customFields 自定义字段映射
     * @param context      上下文（工作簿或工作表）
     */
    private static void printCustomFields(Map<String, Object> customFields, String context) {
        if (customFields == null || customFields.isEmpty()) {
            return;
        }

        System.out.println("\n--- " + context + " 自定义字段 ---");
        customFields.forEach((key, value) -> {
            if (value != null) {
                System.out.println("  " + key + ": " + value);
            } else {
                System.out.println("  " + key + ": null");
            }
        });
    }

    /**
     * 打印行数据的自定义字段
     * 
     * @param rowData 行数据映射
     */
    private static void printRowDataCustomFields(Map<String, org.example.sheets.RowData> rowData) {
        if (rowData == null || rowData.isEmpty()) {
            return;
        }

        // 统计有自定义字段的行数量
        long rowsWithCustomFields = rowData.values().stream()
                .filter(row -> row.getCustom() != null && !row.getCustom().isEmpty())
                .count();

        if (rowsWithCustomFields > 0) {
            System.out.println("有自定义字段的行数量: " + rowsWithCustomFields);

            // 打印每个有自定义字段的行的详细信息
            rowData.forEach((rowIndex, row) -> {
                if (row.getCustom() != null && !row.getCustom().isEmpty()) {
                    printCustomFields(row.getCustom(), "行" + rowIndex);
                }
            });
        }
    }

    /**
     * 打印列数据的自定义字段
     * 
     * @param columnData 列数据映射
     */
    private static void printColumnDataCustomFields(Map<String, org.example.sheets.ColumnData> columnData) {
        if (columnData == null || columnData.isEmpty()) {
            return;
        }

        // 统计有自定义字段的列数量
        long columnsWithCustomFields = columnData.values().stream()
                .filter(column -> column.getCustom() != null && !column.getCustom().isEmpty())
                .count();

        if (columnsWithCustomFields > 0) {
            System.out.println("有自定义字段的列数量: " + columnsWithCustomFields);

            // 打印每个有自定义字段的列的详细信息
            columnData.forEach((columnIndex, column) -> {
                if (column.getCustom() != null && !column.getCustom().isEmpty()) {
                    printCustomFields(column.getCustom(), "列" + columnIndex);
                }
            });
        }
    }
}