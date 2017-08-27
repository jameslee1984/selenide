package com.jingshou.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by lijingshou on 2017/7/12.
 */
public class BaiduTest {

    @Test
    public void baiduSearchTest(){
        open("https://www.baidu.com/");
        //根据id查找元素，并进行操作
        $("#kw").sendKeys("selenide");
        $("#su").click();
        //断言验证搜索到的信息是否等于selenide
        $(By.xpath("//*[@id=\"1\"]/h3/a/em")).shouldHave(text("selenide"));
        $("#submit").shouldBe(enabled).click();

    }
}
