package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"file:D:/project/seleniumv2/src/test/java/config/ConfigDemo.properties" })
public interface ConfigDemo extends Config {


  String startpage();
  String Name();
  String Email();
  String CurAddress();
  String PerAddress();
}

