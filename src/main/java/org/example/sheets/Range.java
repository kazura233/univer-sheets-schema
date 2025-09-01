package org.example.sheets;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 范围数据结构
 */
@Getter
@Setter
@ToString
public class Range {

  /**
   * 工作簿 ID
   */
  private String unitId;

  /**
   * 工作表 ID
   */
  private String sheetId;

  /**
   * 起始行（包含）
   */
  private Integer startRow;

  /**
   * 结束行（不包含）
   */
  private Integer endRow;

  /**
   * 起始列（包含）
   */
  private Integer startColumn;

  /**
   * 结束列（不包含）
   */
  private Integer endColumn;

  /**
   * 范围类型
   * 对应枚举 RANGE_TYPE:
   * NORMAL=0,
   * ROW=1,
   * COLUMN=2,
   * ALL=3
   */
  private Integer rangeType;

  /**
   * 起始绝对引用类型
   * 对应枚举 AbsoluteRefType:
   * NONE=0, // A1
   * ROW=1, // A$1
   * COLUMN=2, // $A1
   * ALL=3 // $A$1
   */
  private Integer startAbsoluteRefType;

  /**
   * 结束绝对引用类型
   * 对应枚举 AbsoluteRefType:
   * NONE=0, // A1
   * ROW=1, // A$1
   * COLUMN=2, // $A1
   * ALL=3 // $A$1
   */
  private Integer endAbsoluteRefType;
}
