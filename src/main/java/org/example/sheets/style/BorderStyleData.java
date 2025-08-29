package org.example.sheets.style;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 边框样式属性
 */
@Getter
@Setter
@ToString
public class BorderStyleData {

  /**
   * 边框样式类型
   * 对应枚举 BorderStyleTypes
   */
  private Integer s;

  /**
   * 边框颜色
   */
  private ColorStyle cl;
}
