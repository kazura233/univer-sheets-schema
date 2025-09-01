package org.example.sheets;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 行标题设置
 */
@Getter
@Setter
@ToString
public class RowHeader {

  /**
   * 宽度
   */
  private Double width;

  /**
   * 隐藏
   * 对应枚举 BooleanNumber:
   * FALSE=0,
   * TRUE=1
   */
  private Integer hidden;
}
