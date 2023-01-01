package PackagePochtaMail;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static PackagePochtaMail.ru.driver;

public class TeslListener implements TestWatcher {
    public void testFailed(ExtensionContext context,Throwable cause){
        Allure.getLifecycle().addAttachment("screenshot","image/png","png",
                ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
        driver.close();
        driver.quit();
    }

}
