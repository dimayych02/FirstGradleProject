import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class FirstJavaGradleClass {
    @Test
    public void test1(){
        Selenide.open("https://lichess.org/");
    }
}
