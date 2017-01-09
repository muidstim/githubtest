package com.company;

import static org.testng.Assert.*;

import java.util.*;

import com.sun.xml.internal.fastinfoset.util.StringArray;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * Created by Administrator on 11/25/2016.
 */
public class MainTest {
    @DataProvider(name="passwords")
    public static Object[][] getPassword(){

        StringArray s = new StringArray();



        return new Object[][]{
                {"abc", "nop"},
                {"123", "123"},
                {"xyz", "klm"},
                {"a", "n"},
                {"m", "z"},
        };
    }










    @DataProvider(name="all numbers from 1 to 1000")
    public static Object[][] getNumbers(){
        Object[][] n = new Object[1001][2];

        for (int i = 0; i <= 1000; i++){

            n[i][0] = String.valueOf(i);
            n[i][1] = String.valueOf(i);

        }

        return n;
    }








    @Test(dataProvider = "passwords", enabled = false)

    public void testEncrypt13(String input, String expectedOutput) throws Exception {
        assertEquals(Main.encrypt13(input), expectedOutput);
    }






    @DataProvider(name = "mydata")
    public static Object[][] getMyData(){
        Object[][] dataMatrix = new Object[][]{
                {4.0, 2.0},
                {16.0, 4.0},
                {25.0, 5.0},
                {15.0, 2.0},
                {2.0, 4.0},
        };

        return dataMatrix;
    }

    @Test(dataProvider = "mydata")
    public void testSquareRoot_0001(double input, double expectedOutput){
        assertEquals(Main.squareRoot(input), expectedOutput);
    }












    @Test(dataProvider = "all numbers from 1 to 1000", enabled = false)
    public void testEncrypt5_AllNumbers1to1000(String input, String expected) throws Exception {

        String result = Main.encrypt5(input);


        assertEquals(Main.encrypt5(result), input);
    }

}