package org.example.sheets.style;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 文本装饰属性
 */
@Getter
@Setter
@ToString
public class TextDecoration {

  /**
   * 显示
   * 对应枚举 BooleanNumber: FALSE=0, TRUE=1
   */
  private Integer s;

  /**
   * 颜色是否跟随字体颜色。默认值为 TRUE，未定义时也为 TRUE。当 c 为 TRUE 时，cl 无效。
   * 对应枚举 BooleanNumber: FALSE=0, TRUE=1
   */
  private Integer c;

  /**
   * 颜色
   */
  private ColorStyle cl;

  /**
   * 线条类型
   * 对应枚举 TextDecoration
   */
  private Integer t;
}
