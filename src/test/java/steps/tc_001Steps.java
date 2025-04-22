package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver = new ChromeDriver();
    tc_001Page loginPage = new tc_001Page(driver);

    @Given("^el navegador está abierto en la página de login$")
    public void el_navegador_esta_abierto_en_la_pagina_de_login() {
        driver.get("http://tusitio.com/login");
    }

    @When("^ingreso el nombre de usuario \"([^\"]*)\"$")
    public void ingreso_el_nombre_de_usuario(String usuario) {
        loginPage.ingresarUsuario(usuario);
    }

    @When("^ingreso la contraseña \"([^\"]*)\"$")
    public void ingreso_la_contraseña(String contraseña) {
        loginPage.ingresarContraseña(contraseña);
    }

    @Then("^debería poder iniciar sesión correctamente$")
    public void deberia_poder_iniciar_sesion_correctamente() {
        Assert.assertTrue(loginPage.isLoginSuccessful());
    }
}