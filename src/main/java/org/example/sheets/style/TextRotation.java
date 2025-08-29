package org.example.sheets.style;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 文本旋转设置
 */
@Getter
@Setter
@ToString
public class TextRotation {

  /**
   * 角度
   */
  private Integer a;

  /**
   * 垂直显示
   * 对应枚举 BooleanNumber: FALSE=0, TRUE=1
   */
  private Integer v;
}
