package org.example.sheets.style;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("ff")
    private String ff;

    /**
     * 字体大小 (pt)
     */
    @JsonProperty("fs")
    private Double fs;

    /**
     * 斜体
     * 对应枚举 BooleanNumber:
     * FALSE=0,
     * TRUE=1
     */
    @JsonProperty("it")
    private Integer it;

    /**
     * 粗体
     * 对应枚举 BooleanNumber:
     * FALSE=0,
     * TRUE=1
     */
    @JsonProperty("bl")
    private Integer bl;

    /**
     * 下划线
     */
    @JsonProperty("ul")
    private TextDecoration ul;

    /**
     * 底部边框线
     */
    @JsonProperty("bbl")
    private TextDecoration bbl;

    /**
     * 删除线
     */
    @JsonProperty("st")
    private TextDecoration st;

    /**
     * 上划线
     */
    @JsonProperty("ol")
    private TextDecoration ol;

    /**
     * 背景色
     */
    @JsonProperty("bg")
    private ColorStyle bg;

    /**
     * 边框
     */
    @JsonProperty("bd")
    private BorderData bd;

    /**
     * 前景色
     */
    @JsonProperty("cl")
    private ColorStyle cl;

    /**
     * 基线偏移 (下标/上标文本)
     * 对应枚举 BaselineOffset:
     * NORMAL=1,
     * SUBSCRIPT=2,
     * SUPERSCRIPT=3
     */
    @JsonProperty("va")
    private Integer va;

    /**
     * 数字格式模式
     */
    @JsonProperty("n")
    private NumberFormat n;
}
