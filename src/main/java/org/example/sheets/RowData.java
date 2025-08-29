package org.example.sheets;

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
  private Integer h;

  /**
   * 当前行是否自适应其内容，true 时使用 ah 设置行高，否则使用 h
   * 对应枚举 BooleanNumber: FALSE=0, TRUE=1
   */
  private Integer ia;

  /**
   * 自动高度
   */
  private Integer ah;

  /**
   * 隐藏
   * 对应枚举 BooleanNumber: FALSE=0, TRUE=1
   */
  private Integer hd;

  /**
   * 样式 ID
   * StyleData | string
   */
  @JsonDeserialize(using = StyleDataDeserializer.class)
  private Object s;

  /**
   * 用户存储的自定义字段
   */
  private Map<String, Object> custom;
}
