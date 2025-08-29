package org.example.sheets.style;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 上下左右的边框样式属性
 */
@Getter
@Setter
@ToString
public class BorderData {

  /**
   * 顶部边框
   */
  private BorderStyleData t;

  /**
   * 右侧边框
   */
  private BorderStyleData r;

  /**
   * 底部边框
   */
  private BorderStyleData b;

  /**
   * 左侧边框
   */
  private BorderStyleData l;

  /**
   * 左上到右下对角线
   */
  @JsonProperty("tl_br")
  private BorderStyleData tlBr;

  /**
   * 左上到底部中心对角线
   */
  @JsonProperty("tl_bc")
  private BorderStyleData tlBc;

  /**
   * 左上到右侧中心对角线
   */
  @JsonProperty("tl_mr")
  private BorderStyleData tlMr;

  /**
   * 左下到右上对角线
   */
  @JsonProperty("bl_tr")
  private BorderStyleData blTr;

  /**
   * 左侧中心到右上对角线
   */
  @JsonProperty("ml_tr")
  private BorderStyleData mlTr;

  /**
   * 底部中心到右上对角线
   */
  @JsonProperty("bc_tr")
  private BorderStyleData bcTr;
}
