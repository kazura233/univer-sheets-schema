package org.example.sheets;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.sheets.deserializer.StyleDataDeserializer;
import org.example.sheets.style.StyleData;

import java.util.List;
import java.util.Map;

/**
 * 工作簿数据快照
 */
@Getter
@Setter
@ToString
public class WorkbookData {

  /**
   * Univer Sheet 的 ID
   */
  private String id;

  /**
   * 此电子表格的修订版本。用于协作编辑。从 1 开始。
   */
  private Integer rev;

  /**
   * Univer Sheet 的名称
   */
  private String name;

  /**
   * Univer 模型定义的版本
   */
  private String appVersion;

  /**
   * 文档的语言环境
   * 对应枚举 LocaleType:
   * EN_US='enUS',
   * FR_FR='frFR',
   * ZH_CN='zhCN',
   * RU_RU='ruRU',
   * ZH_TW='zhTW',
   * VI_VN='viVN',
   * FA_IR='faIR',
   * KO_KR='koKR',
   * ES_ES='esES',
   * CA_ES='caES'
   */
  private String locale;

  /**
   * 样式引用
   */
  private Map<String, StyleData> styles;

  /**
   * 此 Univer Sheet 中工作表数据的 ID 列表，按顺序排列
   */
  private List<String> sheetOrder;

  /**
   * 此 Univer Sheet 中每个工作表的数据
   */
  private Map<String, WorksheetData> sheets;

  /**
   * 工作簿的默认样式 ID 或样式数据
   */
  @JsonDeserialize(using = StyleDataDeserializer.class)
  private Object defaultStyle;

  /**
   * Univer Sheet 的资源。用于存储其他插件的数据。
   */
  private List<Resources> resources;

  /**
   * 用户存储的自定义字段
   */
  private Map<String, Object> custom;
}
