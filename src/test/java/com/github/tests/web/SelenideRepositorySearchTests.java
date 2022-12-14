package com.github.tests.web;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearchTests extends TestBase {

    @Test
    void shouldFindSelenideRepository() {
        open("https://github.com/");
//        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
//        $$(".repo-list li").first().$("a").click();
//        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }
}
