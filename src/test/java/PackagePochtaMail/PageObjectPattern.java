package PackagePochtaMail;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TeslListener.class)
public class PageObjectPattern   {

    public final static String GooglePath = "https://www.google.com/";
    public final static String mail  ="mail.ru";
    public final static String link = "//a[@href=\"https://account.mail.ru/login\"]";
    public final static String Search ="//input[@class=\"gLFyf\"]";
    public final static String LoginPath = "//input[@name=\"username\"]";
    public final static String LoginData = "askmail123456";
    public final static String PasswordPath ="//input[@name=\"password\"]";
    public final static String PasswordData ="vsemprivet@12345671245etedgvg";
    public final static String Except ="//div[@class=\"ph-project-promo-close-icon__container svelte-m7oyyo\"]";
    public final static String SendMessagePath ="//span[@class=\"compose-button__txt\"]";
    public final static String EmailXpath ="//input[@style=\"width: 12px;\"]";
    public final static String Email = "dkkffk";
    public final static String XpathMessage = "//div[@aria-multiline=\"true\"]//child::div";
    public final static String Message = "Добрый день\n Простейший автотест готов\n Кирилин Дмитрий Дмитриевич\n ссылка на код:https://github.com/dimayych02/ss.git";



    public final String v="//button[@type=\"button\"]//span[text()='Отправить']";
    ru Test = new ru();

    @Test
    public void test1(){
        Test.SettingDriver();
    }
    @RepeatedTest(3)
    @Test
    public void test2(){
        Test.OpenDriver(GooglePath);
    }
    @RepeatedTest(3)
    @Test
    public void test3(){
        Test.OpenMail(Search,mail,link);
    }
    @RepeatedTest(3)
    @Test
    public void test4() {

        Test.LogIn(LoginPath,LoginData,PasswordPath,PasswordData);
    }
    @RepeatedTest(3)
    @Test
    public void test5(){

        Test.SendMessage(Except,SendMessagePath,EmailXpath,Email,XpathMessage,Message,v);
    }


}
