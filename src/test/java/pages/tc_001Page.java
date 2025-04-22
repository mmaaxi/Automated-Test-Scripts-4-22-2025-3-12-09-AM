package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    WebDriver driver;

    By usuarioField = By.id("usuario");
    By contraseñaField = By.id("contraseña");
    By loginButton = By.id("login");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarUsuario(String usuario) {
        driver.findElement(usuarioField).sendKeys(usuario);
    }

    public void ingresarContraseña(String contraseña) {
        driver.findElement(contraseñaField).sendKeys(contraseña);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isLoginSuccessful() {
        // Implementación de verificación de éxito de login
        // Retornamos true como placeholder
        return true;
    }
}