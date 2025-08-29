package org.example.sheets;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.sheets.deserializer.StyleDataDeserializer;
import java.util.Map;

/**
 * 单元格数据
 */
@Getter
@Setter
@ToString
public class CellData {

  /**
   * Univer 文档数据，设置为 null 表示清除所有单元格
   */
  private Object p;

  /**
   * 样式 ID
   * StyleData | string
   */
  @JsonDeserialize(using = StyleDataDeserializer.class)
  private Object s;

  /**
   * 原始值
   * string | number | boolean | null
   */
  private Object v;

  /**
   * 单元格值类型
   * 对应枚举 CellValueType: 1=string, 2=number, 3=boolean, 4=force string
   */
  private Integer t;

  /**
   * 原始公式字符串。例如 =SUM(A1:B4)
   */
  private String f;

  /**
   * 如果公式是公式数组，此字段用于存储引用范围
   */
  private String ref;

  /**
   * 公式的 ID
   */
  private String si;

  /**
   * 用户存储的自定义字段
   */
  private Map<String, Object> custom;
}
