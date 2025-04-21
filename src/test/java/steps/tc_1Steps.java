package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.tc_1Page;

public class tc_1Steps {

    WebDriver driver;
    tc_1Page googleSheetPage;

    @Given("El usuario abre el navegador en la URL de la hoja de Google")
    public void elUsuarioAbreElNavegadorEnLaURLDeLaHojaDeGoogle() {
        // Configura el WebDriver, por ejemplo, utilizando ChromeDriver para Chrome
        System.setProperty("webdriver.chrome.driver", "ruta/a/chromedriver");
        driver = new ChromeDriver();
        
        // Inicializa el page object
        googleSheetPage = new tc_1Page(driver);
        
        // Abre la URL de la hoja de Google
        googleSheetPage.openGoogleSheet("https://docs.google.com/spreadsheets/d/...");
    }

    @Then("La hoja de Google se abre correctamente")
    public void laHojaDeGoogleSeAbreCorrectamente() {
        // Verificar que el título de la página contiene "Google Sheets"
        googleSheetPage.verifyPageLoaded();
        
        // Cierra el navegador
        driver.quit();
    }
}