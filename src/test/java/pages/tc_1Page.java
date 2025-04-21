package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_1Page {

    WebDriver driver;

    public tc_1Page(WebDriver driver) {
        this.driver = driver;
    }

    // Método para abrir la URL de la hoja de Google
    public void openGoogleSheet(String url) {
        driver.get(url);
    }

    // Método para verificar que la página se cargó correctamente
    public void verifyPageLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Google Sheets"));
    }
}