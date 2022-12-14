package com.github.tests.web;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.helpers.Attach;
import com.github.config.WebDriverProvider;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setUp() {
        WebDriverProvider.configure();
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addedAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.addVideo();
    }
}