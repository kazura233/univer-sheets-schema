package org.example.sheets;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;
import java.util.Map;

/**
 * 工作表数据快照
 */
@Getter
@Setter
@ToString
public class WorksheetData {

  /**
   * 工作表的 ID。在工作表的整个生命周期中应该是唯一且不可变的。
   */
  private String id;

  /**
   * 工作表的名称
   */
  private String name;

  /**
   * 标签颜色
   */
  private String tabColor;

  /**
   * 确定工作表是否隐藏
   * 对应枚举 BooleanNumber:
   * FALSE=0,
   * TRUE=1
   */
  private Integer hidden;

  /**
   * 冻结设置
   */
  private Freeze freeze;

  /**
   * 行数
   */
  private Integer rowCount;

  /**
   * 列数
   */
  private Integer columnCount;

  /**
   * 缩放比例
   *
   * @deprecated
   */
  private Double zoomRatio;

  /**
   * 滚动顶部位置
   *
   * @deprecated
   */
  private Double scrollTop;

  /**
   * 滚动左侧位置
   * 
   * @deprecated
   */
  private Double scrollLeft;

  /**
   * 默认列宽
   */
  private Double defaultColumnWidth;

  /**
   * 默认行高
   */
  private Double defaultRowHeight;

  /**
   * 此工作表中的所有合并单元格
   */
  private List<Range> mergeData;

  /**
   * 按行和列索引存储单元格内容的矩阵
   */
  private Map<String, Map<String, CellData>> cellData;

  /**
   * 行数据
   */
  private Map<String, RowData> rowData;

  /**
   * 列数据
   */
  private Map<String, ColumnData> columnData;

  /**
   * 工作表的默认样式 ID 或样式数据
   */
  private Object defaultStyle;

  /**
   * 行标题设置
   */
  private RowHeader rowHeader;

  /**
   * 列标题设置
   */
  private ColumnHeader columnHeader;

  /**
   * 显示网格线
   * 对应枚举 BooleanNumber:
   * FALSE=0,
   * TRUE=1
   */
  private Integer showGridlines;

  /**
   * 网格线的颜色
   */
  private String gridlinesColor;

  /**
   * 从右到左
   * 对应枚举 BooleanNumber:
   * FALSE=0,
   * TRUE=1
   */
  private Integer rightToLeft;

  /**
   * 用户存储的自定义字段
   */
  private Map<String, Object> custom;
}
