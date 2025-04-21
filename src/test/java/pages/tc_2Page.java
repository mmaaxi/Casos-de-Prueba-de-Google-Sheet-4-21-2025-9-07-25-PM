package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_2Page {
    WebDriver driver;

    // Localizador para el contenido de la hoja
    By contenidoLocator = By.id("contenido");

    public tc_2Page(WebDriver driver) {
        this.driver = driver;
    }

    public String obtenerContenidoMostrado() {
        // Retorna el texto del contenido mostrado en la página
        return driver.findElement(contenidoLocator).getText();
    }
}