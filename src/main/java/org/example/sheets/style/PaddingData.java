package org.example.sheets.style;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 上下左右内边距
 */
@Getter
@Setter
@ToString
public class PaddingData {

  /**
   * 顶部内边距
   */
  @JsonProperty("t")
  private Double t;

  /**
   * 右侧内边距
   */
  @JsonProperty("r")
  private Double r;

  /**
   * 底部内边距
   */
  @JsonProperty("b")
  private Double b;

  /**
   * 左侧内边距
   */
  @JsonProperty("l")
  private Double l;
}
