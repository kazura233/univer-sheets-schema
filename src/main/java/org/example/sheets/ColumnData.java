package org.example.sheets;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.sheets.deserializer.StyleDataDeserializer;
import java.util.Map;

/**
 * 列数据属性
 */
@Getter
@Setter
@ToString
public class ColumnData {

  /**
   * 宽度
   */
  @JsonProperty("w")
  private Double w;

  /**
   * 隐藏
   * 对应枚举 BooleanNumber:
   * FALSE=0,
   * TRUE=1
   */
  @JsonProperty("hd")
  private Integer hd;

  /**
   * 样式 ID
   * StyleData | string
   */
  @JsonDeserialize(using = StyleDataDeserializer.class)
  @JsonProperty("s")
  private Object s;

  /**
   * 用户存储的自定义字段
   */
  private Map<String, Object> custom;
}
