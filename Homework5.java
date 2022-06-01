package Davaleba;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.commands.GetText;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;

public class Homework5 {
    @Test
    public void davaleba5() {
        //•	გადადით რეგისტრაციის გვერდზე
        Selenide.open("https://ee.ge/registration");
        Configuration.browserSize = "1920*1088";
        //•	შეამოწმეთ რომ ნამდვილად რეგისტრაციის გვერდზე ხართ
        $(byText("რეგისტრაცია")).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        Assert.assertTrue($(byText("რეგისტრაცია")).is(Condition.visible));

        //•	შეავსეთ სახელის ველი, დარწმუნდით რომ მონაცემი ჩაიწერა ანუ ველი არ არის ცარიელი
        $("firsName").setValue("მარიამი");
        $("firstName").shouldBe(Condition.empty);
        $(byText("firstName")).shouldBe(Condition.visible);
        $("#firstName").click();
        Assert.assertEquals("მარიამი",  $("firsName").getText();
        //•	შეავსეთ გვარის ველი, დარწმუნდით რომ მონაცემი ჩაიწერა ანუ ველი არ არის ცარიელი
        $(byText("გვარი")).shouldBe(Condition.visible);
        $("#გვარი").setValue("კოსტავა");
        $("#გვარი").click();
        Assert.assertEquals("კოსტავა",$("#გვარი").getText();

        //•	შეავსეთ მეილის ველი სწორი მნიშვნელობით , დარწმუნდით რომ მონაცემი ჩაიწერა ანუ ველი არ არის ცარიელი
        $("email").click();
        $("email").setValue("mariami.kostava.1@iliauni.edu.ge");
        $("email").shouldBe(Condition.visible);
        Assert.assertEquals("mariami.kostava.1@iliauni.edu.ge",  $("email").getText());
        sleep(1000);
        //•	შეავსეთ პაროლის ველი
        $("password").click();
        $("password").setValue("Aa123456");
        //•	შეავსეთ გაიმეორეთ პაროლის ველი
        $("confirmPassword").setValue("Aa123456");
        //•	შეამოწმეთ რომ რეგისტრაციის ველი არის Enabled
        $("singup").shouldBe(Condition.enabled);
        Assert.assertTrue($(byText("singup")).isEnabled();



    }




        @Test
    public void test5(){
            //•	გადადით კალათაში და დარწმუნდით რომ ცარიელია
            // Selenide.open("https://ee.ge/checkout");
            Configuration.browserSize="1920*1088";
            $(".btn-cart").click();
            $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
            Assert.assertTrue($(byText("კალათა ცარიელია")).is(Condition.empty));

            //•	დასერჩეთ ნებისმიერი რაღაც რასაც შედეგი ექნება, მაგალითად კომპიუტერი, პირეველივე შედეგი დაამატეთ კალათაში
            $("search_list").click();
            $("search_list").setValue("კომპიუტერი").pressEnter();
            $(".add_to_cart", 0).click();
            Assert.assertTrue( $("search_list").is(Condition.visible));
            //•	გადადით კალათაში ნახეთ რომ კალათა აღარაა ცარიელი
            $(".btn-cart").click();
            $(byText("cart-count")).shouldBe(Condition.disabled);
            Assert.assertTrue( $(byText("cart-count")).is(Condition.disabled));
            //•	წაშალეთ კალათიდან პროდუქტი
            $(byText("წაშლა")).click();
            //•	დარწმუნდით რომ კალათა კვლავ ცარიელია
            $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
            Assert.assertTrue($(byText("კალათა ცარიელია")).is(Condition.visible));


        }



        }
















