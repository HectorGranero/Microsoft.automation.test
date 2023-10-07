package qaminds.curso.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import qaminds.curso.BaseTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;
import java.util.List;

public class DesktopHeaderTest extends BaseTest {

    @Test(testName = "Validar el header de Microsoft", description = "Validar que existan los elementos del header en la pagina principal de Microsoft")
    public void validateHeader() {
        String[] menuList = {"Microsoft 365","Teams", "Windows", "Surface", "Xbox", "Soporte"};

        WebElement menuElement = getDriver().findElement(By.cssSelector("#uhf-g-nav > ul"));

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(menuElement.findElements(By.tagName("a"))));

        List<String> myList = menuElement.findElements(By.tagName("a")).stream()
               .map(WebElement::getText)
               .toList();


        assertThat(myList).contains(menuList);

    }

    @Test(testName = "Validar el header de Microsoft", description = "Validar que existan los elementos del header en la pestaña de Acerca de Windows")
    public void validateVentanaWindows() {
        String[] menuWindowsList = { "Descubre Windows 11", "Comparar Windows 10 y 11", "Seguridad de Windows 11", "Edición de fotos y películas", "Aplicaciones", "Juegos", "Sincroniza smartphones con la computadora", "Características de accesibilidad de Windows", "Sugerencias y trucos" };

        WebElement menuWindows = getDriver().findElement(By.id("shellmenu_2"));
        menuWindows.click();

        WebElement buttonAboutWindows = getDriver().findElement(By.id("c-shellmenu_48"));
        buttonAboutWindows.click();

        WebElement menuAboutWindows = getDriver().findElement(By.cssSelector("#uhf-g-nav > ul > li:nth-child(2) > div > ul"));

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(menuAboutWindows.findElements(By.tagName("a"))));


        List<String> myList = menuAboutWindows.findElements(By.tagName("a")).stream()
                .map(WebElement::getText)
                .toList();

        assertThat(myList).contains(menuWindowsList);
    }
}
