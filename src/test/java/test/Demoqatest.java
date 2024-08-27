package test;

import static org.aeonbits.owner.ConfigFactory.getProperty;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.ConfigDemo;
import config.DemoqaPage1;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Demoqatest {

  DemoqaPage1 page1 = new DemoqaPage1();
  private ConfigDemo cfg = ConfigFactory.create(ConfigDemo.class);


  @BeforeEach

  public void setup() {
    Selenide.open(cfg.startpage());
    Configuration.pageLoadStrategy = cfg.pageLoadStrategy();
    Configuration.browserSize = cfg.browserSize();
  }


  @Test
  @DisplayName("Проверка заполнения полей userName,userEmail,currentAddress,permanentAddress")
  public void DemoqaTest_1() {

    page1.clickElements().click();
    //кликаем по карточке elements
    page1.clickTextbox();
    //кликаем по карточке Textbox
    page1.inputUserName(cfg.Name());
    page1.inputUserEmail(cfg.Email());
    page1.inputCurrentAddress(cfg.CurAddress());
    page1.inputPermanentAddress(cfg.PerAddress());
    page1.ScrollSubmitBtn();
    page1.clickSubmitBtn();
    page1.checkEmail();
    page1.checkName();
  }

  @Test
  @DisplayName("Открытие новой вкладки")
  public void DemoqaTest_2() {
    page1.clickAlertsFrameWindows();
    page1.clickBrowserWindows();
    page1.clickBrowserWindows();
    page1.clickButtonNewTab();
    page1.openNewPage();
    page1.openSampleHeading();
  }
}