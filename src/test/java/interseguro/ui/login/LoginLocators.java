package interseguro.ui.login;

import org.openqa.selenium.By;

public class LoginLocators {
    public static By DOCUMENT_FIELD = By.id("form-nro-doc");
    public static By PHONE_FIELD = By.xpath("//input[@id='form-nro-celular']");
    public static By EMAIL_FIELD = By.xpath("(//input[@id='form-email'])[2]");
    public static By LOQUIERO_BUTTON = By.xpath("(//input[@id='btn-enviar-educacion'])[2]");
    public static By MESSAGE_TEXTO = By.xpath("(//div[@class='screen-reader-response'])[2]");
    //(//*[contains(text(),'Uno o más campos tienen un error. Por favor revisa e inténtalo de nuevo.')])[1]


}
