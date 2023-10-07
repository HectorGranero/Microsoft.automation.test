package qaminds.curso.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import qaminds.curso.BaseTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MobileHeaderTest extends BaseTest {

    @Test(testName = "Validar el header de Microsoft", description = "Validar que existan los elementos del header en la pagina principal de Microsoft")
    public void validateHeader() {
        String[] menuList = {"Microsoft 365","Teams", "Windows", "Surface", "Xbox", "Soporte"};
        String[] subMenuList = { "Software", "PCs y dispositivos", "Entretenimiento", "Empresas", "Desarrollador y TI", "Otros", "Ver mapa del sitio"};

        WebElement toogleMenu = getDriver().findElement(By.cssSelector("button.c-action-trigger.c-glyph.glyph-global-nav-button"));
        toogleMenu.click();

        WebElement menuElement2 = getDriver().findElement(By.cssSelector("#uhf-c-nav > ul > li > div > ul"));





        /*List<String> myList = menuElement.findElements(By.tagName("a")).stream()
               .map(WebElement::getText)
               .toList();

        assertThat(myList).contains(menuList);

    }
    @Test(testName = "Validar el header de Microsoft", description = "Validar que existan los elementos del header en la opcion de Windows")
    public void validateVentanaWindows() {
        String[] menuWindowsList = { "" };*/
    }
}
