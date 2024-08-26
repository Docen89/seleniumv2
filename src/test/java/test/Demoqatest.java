package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.ConfProperties;
import config.DemoqaPage1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Demoqatest  {

      DemoqaPage1 page1= new DemoqaPage1();



  @BeforeEach
  public void setup() {
    Selenide.open(ConfProperties.getProperty("startpage"));
    Configuration.pageLoadStrategy = "eager";
    Configuration.browserSize = "1920x1080";
  }


  @Test
  @DisplayName("Проверка заполнения полей userName,userEmail,currentAddress,permanentAddress")
  public void DemoqaTest_1() {

    page1.clickElements().click();
    //кликаем по карточке elements
    page1.clickTextbox();
    //кликаем по карточке Textbox
    page1.inputUserName(ConfProperties.getProperty("Name"));
    page1.inputUserEmail(ConfProperties.getProperty("Email"));
    page1.inputCurrentAddress(ConfProperties.getProperty("CurAddress"));
    page1.inputPermanentAddress(ConfProperties.getProperty("PerAddress"));
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