package org.example.sheets.style;

import com.fasterxml.jackson.annotation.JsonProperty;
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
  @JsonProperty("rgb")
  private String rgb;

  /**
   * 主题颜色类型
   * 对应枚举 ThemeColorType:
   * DARK1=0,
   * LIGHT1=1,
   * DARK2=2,
   * LIGHT2=3,
   * ACCENT1=4,
   * ACCENT2=5,
   * ACCENT3=6,
   * ACCENT4=7,
   * ACCENT5=8,
   * ACCENT6=9,
   * HYPERLINK=10,
   * FOLLOWED_HYPERLINK=11,
   */
  @JsonProperty("th")
  private Integer th;
}
