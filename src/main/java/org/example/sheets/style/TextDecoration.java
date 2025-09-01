package org.example.sheets.style;

import com.fasterxml.jackson.annotation.JsonProperty;
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
   * 对应枚举 BooleanNumber:
   * FALSE=0,
   * TRUE=1
   */
  @JsonProperty("s")
  private Integer s;

  /**
   * 颜色是否跟随字体颜色。默认值为 TRUE，未定义时也为 TRUE。当 c 为 TRUE 时，cl 无效。
   * 对应枚举 BooleanNumber:
   * FALSE=0,
   * TRUE=1
   */
  @JsonProperty("c")
  private Integer c;

  /**
   * 颜色
   */
  @JsonProperty("cl")
  private ColorStyle cl;

  /**
   * 线条类型
   * 对应枚举 TextDecoration:
   * DASH=0,
   * DASH_DOT_DOT_HEAVY=1,
   * DASH_DOT_HEAVY=2,
   * DASHED_HEAVY=3,
   * DASH_LONG=4,
   * DASH_LONG_HEAVY=5,
   * DOT_DASH=6,
   * DOT_DOT_DASH=7,
   * DOTTED=8,
   * DOTTED_HEAVY=9,
   * DOUBLE=10,
   * NONE=11,
   * SINGLE=12,
   * THICK=13,
   * WAVE=14,
   * WAVY_DOUBLE=15,
   * WAVY_HEAVY=16
   * WORDS=17
   */
  @JsonProperty("t")
  private Integer t;
}
