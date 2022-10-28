package org.louis296;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        // macOS
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_mac_os");

        // windows
        // System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_win.exe");

        WebDriver webDriver=new ChromeDriver();
        webDriver.get("http://120.25.62.254:8080/");

        // 测试关闭音乐
        webDriver.findElement(By.className("t-audio")).click();

        Actions a=new Actions(webDriver);

        // 测试开始游戏
        a.sendKeys(Keys.SPACE).perform();

        // 测试方块右移
        for (int i=0;i<4;i++){
            a.sendKeys(Keys.ARROW_RIGHT).perform();
            Thread.sleep(500);
        }

        // 测试方块快速下落
        a.sendKeys(Keys.SPACE).perform();
        Thread.sleep(500);

        // 测试方块左移
        for (int i=0;i<4;i++){
            a.sendKeys(Keys.ARROW_LEFT).perform();
            Thread.sleep(500);
        }

        a.sendKeys(Keys.SPACE).perform();
        Thread.sleep(500);

        // 测试方块旋转
        for (int i=0;i<4;i++){
            a.sendKeys(Keys.ARROW_UP).perform();
            Thread.sleep(500);
        }

        a.sendKeys(Keys.SPACE).perform();
        Thread.sleep(500);

        // 测试方块在旋转的同时右移
        for (int i=0;i<4;i++){
            a.sendKeys(Keys.ARROW_UP).perform();
            a.sendKeys(Keys.ARROW_RIGHT).perform();
            Thread.sleep(500);
        }

        a.sendKeys(Keys.SPACE).perform();
        Thread.sleep(500);

        // 测试方块在旋转的同时左移
        for (int i=0;i<4;i++){
            a.sendKeys(Keys.ARROW_UP).perform();
            a.sendKeys(Keys.ARROW_LEFT).perform();
            Thread.sleep(500);
        }

        a.sendKeys(Keys.SPACE).perform();
        Thread.sleep(500);

        // 测试游戏暂停
        webDriver.findElement(By.className("t-pause")).click();
    }



}