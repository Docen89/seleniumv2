package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfProperties {

  protected static FileInputStream fileInputStream;
  protected static Properties  properties;

  static {
    File file = new File("src/test/resources/conf.properties");
    properties = new Properties();
    try {
      properties.load(new FileReader(file));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * метод для возврата строки со значением из файла с настройками
   */
  public static String getProperty(String key) {
    return  properties.getProperty(key);
  }
}
