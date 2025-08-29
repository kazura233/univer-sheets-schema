package org.example.sheets.style;

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
  private Double t;

  /**
   * 右侧内边距
   */
  private Double r;

  /**
   * 底部内边距
   */
  private Double b;

  /**
   * 左侧内边距
   */
  private Double l;
}
