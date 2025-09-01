package org.example.sheets;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 列标题设置
 */
@Getter
@Setter
@ToString
public class ColumnHeader {

  /**
   * 高度
   */
  private Double height;

  /**
   * 隐藏
   * 对应枚举 BooleanNumber:
   * FALSE=0,
   * TRUE=1
   */
  private Integer hidden;
}
