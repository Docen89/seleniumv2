package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;
import org.aeonbits.owner.Config.Sources;

@LoadPolicy(LoadType.MERGE)
@Sources({"classpath:config.properties"})
public interface config extends Config {


  @Key("start.page")
  String startpage();

  @Key("name")
  String name();

  @Key("email")
  String email();

  @Key("cur.address")
  String curaddress();

  @Key("per.address")
  String peraddress();

  @Key("browser.size")
  String browsersize();

  @Key("page.load.strategy")
  String pageloadstrategy();
}

