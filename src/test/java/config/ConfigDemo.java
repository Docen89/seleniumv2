package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"file:../ConfigDemo.properties", "classpath:ConfigDemo.properties"})
public interface ConfigDemo extends Config {


  String startpage();

  String Name();

  String Email();

  String CurAddress();

  String PerAddress();

  String browserSize();

  String pageLoadStrategy();
}

