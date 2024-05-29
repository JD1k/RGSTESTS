package tests.products.ui;

import org.testng.annotations.Test;

import static products.osago.Calculate.startCalculate;

public class osagoTest {
    // @Test будет запускаться в этом классе в методе. В класее Логин(Calculate) функционал теста
    @Test
    public static void startTest(){
        startCalculate ();
    }
}
