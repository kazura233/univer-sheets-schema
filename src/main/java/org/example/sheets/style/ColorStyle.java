package org.example.sheets.style;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * RGB 颜色或主题颜色
 */
@Getter
@Setter
@ToString
public class ColorStyle {

  /**
   * RGB 颜色值
   */
  private String rgb;

  /**
   * 主题颜色类型
   * 对应枚举 ThemeColorType
   */
  private Integer th;
}
