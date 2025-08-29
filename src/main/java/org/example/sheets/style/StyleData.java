package org.example.sheets.style;

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
  private TextRotation tr;

  /**
   * 文本方向
   * 对应枚举 TextDirection: UNSPECIFIED=0, LEFT_TO_RIGHT=1, RIGHT_TO_LEFT=2
   */
  private Integer td;

  /**
   * 水平对齐
   * 对应枚举 HorizontalAlign: UNSPECIFIED=0, LEFT=1, CENTER=2, RIGHT=3, JUSTIFIED=4, BOTH=5, DISTRIBUTED=6
   */
  private Integer ht;

  /**
   * 垂直对齐
   * 对应枚举 VerticalAlign: UNSPECIFIED=0, TOP=1, MIDDLE=2, BOTTOM=3
   */
  private Integer vt;

  /**
   * 换行策略
   * 对应枚举 WrapStrategy: UNSPECIFIED=0, OVERFLOW=1, CLIP=2, WRAP=3
   */
  private Integer tb;

  /**
   * 内边距
   */
  private PaddingData pd;
}
