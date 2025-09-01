package org.example.sheets.style;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 单元格样式属性
 */
@Getter
@Setter
@ToString(callSuper = true)
public class StyleData extends StyleBase {

  /**
   * 文本旋转
   */
  @JsonProperty("tr")
  private TextRotation tr;

  /**
   * 文本方向
   * 对应枚举 TextDirection:
   * UNSPECIFIED=0,
   * LEFT_TO_RIGHT=1,
   * RIGHT_TO_LEFT=2
   */
  @JsonProperty("td")
  private Integer td;

  /**
   * 水平对齐
   * 对应枚举 HorizontalAlign:
   * UNSPECIFIED=0, // 未指定，请勿使用此值
   * LEFT=1, // 文本明确左对齐到单元格
   * CENTER=2, // 文本明确居中对齐到单元格
   * RIGHT=3, // 文本明确右对齐到单元格
   * JUSTIFIED=4, // 段落两端对齐
   * BOTH=5, // 段落两端对齐
   * DISTRIBUTED=6 // 文本在单元格宽度内均匀分布
   */
  @JsonProperty("ht")
  private Integer ht;

  /**
   * 垂直对齐
   * 对应枚举 VerticalAlign:
   * UNSPECIFIED=0, // 未指定，请勿使用此值
   * TOP=1, // 文本明确顶部对齐到单元格
   * MIDDLE=2, // 文本明确居中对齐到单元格
   * BOTTOM=3 // 文本明确底部对齐到单元格
   */
  @JsonProperty("vt")
  private Integer vt;

  /**
   * 换行策略
   * 对应枚举 WrapStrategy:
   * UNSPECIFIED=0, // 未指定，请勿使用此值
   * OVERFLOW=1, // 文本溢出到下一个单元格（如果下一个单元格为空）。 如果下一个单元格非空，则行为与CLIP相同
   * CLIP=2, // 超过单元格宽度的行将被裁剪。除非用户手动插入换行符，否则文本永远不会换行
   * WRAP=3 // 超过行长的单词在字符级别换行而不是裁剪
   */
  @JsonProperty("tb")
  private Integer tb;

  /**
   * 内边距
   */
  @JsonProperty("pd")
  private PaddingData pd;
}
