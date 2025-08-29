package org.example.sheets;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 资源数据
 */
@Getter
@Setter
@ToString
public class Resources {

  /**
   * 资源 ID
   */
  private String id;

  /**
   * 资源名称
   */
  private String name;

  /**
   * 资源数据
   */
  private String data;
}
