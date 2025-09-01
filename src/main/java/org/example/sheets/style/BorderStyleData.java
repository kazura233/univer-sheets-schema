package org.example.sheets.style;

import com.fasterxml.jackson.annotation.JsonProperty;
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
   * 对应枚举 BorderStyleTypes:
   * NONE=0,
   * THIN=1,
   * HAIR=2,
   * DOTTED=3,
   * DASHED=4,
   * DASH_DOT=5,
   * DASH_DOT_DOT=6,
   * DOUBLE=7,
   * MEDIUM=8,
   * MEDIUM_DASHED=9,
   * MEDIUM_DASH_DOT=10,
   * MEDIUM_DASH_DOT_DOT=11,
   * SLANT_DASH_DOT=12,
   * THICK=13
   */
  @JsonProperty("s")
  private Integer s;

  /**
   * 边框颜色
   */
  @JsonProperty("cl")
  private ColorStyle cl;
}
