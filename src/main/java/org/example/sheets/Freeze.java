package org.example.sheets;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 冻结设置
 */
@Getter
@Setter
@ToString
public class Freeze {

  /**
   * 固定列数
   */
  @JsonProperty("xSplit")
  private Integer xSplit;

  /**
   * 固定行数
   */
  @JsonProperty("ySplit")
  private Integer ySplit;

  /**
   * 可滚动的起始行（viewMain 起始行）
   */
  private Integer startRow;

  /**
   * 可滚动的起始列（viewMain 起始列）
   */
  private Integer startColumn;
}
