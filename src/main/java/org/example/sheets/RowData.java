package org.example.sheets;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.sheets.deserializer.StyleDataDeserializer;
import java.util.Map;

/**
 * 行数据属性
 */
@Getter
@Setter
@ToString
public class RowData {

  /**
   * 高度（像素）
   */
  @JsonProperty("h")
  private Double h;

  /**
   * 当前行是否自适应其内容，true 时使用 ah 设置行高，否则使用 h
   * 对应枚举 BooleanNumber:
   * FALSE=0,
   * TRUE=1
   */
  @JsonProperty("ia")
  private Integer ia;

  /**
   * 自动高度
   */
  @JsonProperty("ah")
  private Double ah;

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
