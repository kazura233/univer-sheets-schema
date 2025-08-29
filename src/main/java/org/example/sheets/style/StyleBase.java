package org.example.sheets.style;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 单元格基础样式属性
 */
@Getter
@Setter
@ToString
public class StyleBase {

    /**
     * 字体系列
     */
    private String ff;

    /**
     * 字体大小 (pt)
     */
    private Double fs;

    /**
     * 斜体
     * 对应枚举 BooleanNumber: FALSE=0, TRUE=1
     */
    private Integer it;

    /**
     * 粗体
     * 对应枚举 BooleanNumber: FALSE=0, TRUE=1
     */
    private Integer bl;

    /**
     * 下划线
     */
    private TextDecoration ul;

    /**
     * 底部边框线
     */
    private TextDecoration bbl;

    /**
     * 删除线
     */
    private TextDecoration st;

    /**
     * 上划线
     */
    private TextDecoration ol;

    /**
     * 背景色
     */
    private ColorStyle bg;

    /**
     * 边框
     */
    private BorderData bd;

    /**
     * 前景色
     */
    private ColorStyle cl;

    /**
     * 基线偏移 (下标/上标文本)
     * 对应枚举 BaselineOffset: NORMAL=1, SUBSCRIPT=2, SUPERSCRIPT=3
     */
    private Integer va;

    /**
     * 数字格式模式
     */
    private NumberFormat n;
}
