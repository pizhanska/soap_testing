package com.ip.data;

import org.testng.annotations.DataProvider;

/**
 * Created by Uliana Pizhanska on 14/05/2017.
 */
public class DataProvd {

    @DataProvider(name = "ipAddress")
    public static Object[][] loginTitle() {
        return new Object[][]{
                {"8.8.8.8"},
                {"88.26.241.248"}
        };
    }
}
