package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_2Page;

public class tc_2Steps {

    WebDriver driver;
    tc_2Page page;

    @Given("el usuario está en la página de la hoja")
    public void el_usuario_esta_en_la_pagina_de_la_hoja() {
        driver = new ChromeDriver();
        page = new tc_2Page(driver);
        driver.get("http://example.com/hoja");
    }

    @When("el usuario revisa el contenido mostrado")
    public void el_usuario_revisa_el_contenido_mostrado() {
        page.obtenerContenidoMostrado();
    }

    @Then("el contenido debe coincidir con lo especificado")
    public void el_contenido_debe_coincidir_con_lo_especificado() {
        String contenidoMostrado = page.obtenerContenidoMostrado();
        String contenidoEsperado = "Especificación de contenido";
        assertEquals(contenidoEsperado, contenidoMostrado);
        driver.quit();
    }
}