package com;

import org.openqa.selenium.By;

public  class Locators {
public static final By NAME_FIELD = By.xpath("//input[@placeholder='@beyonce ou beyonce']") ;
public static final By EMAIL_FIELD = By.xpath("//input[@placeholder='your@email.com']");
public static final By ERROR = By.xpath("//p[text()='Por favor, preencha o campo com seu e-mail']");
public static final By CONTINUAR_BUTTON = By.xpath("//a[.='Continuar']");
}
