package net.serenitybbd.screenplay.util;

public class Utils {

    public static String validateNullString(String key) {
        return null == key ? Constants.EMPTY_VALUE : key;
    }
}
