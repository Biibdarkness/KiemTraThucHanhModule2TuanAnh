package util;

import java.util.regex.Pattern;

public class Utils {
    public static final String PHONE_REGEX = "^[0][1-9][0-9]{8,9}$";
    public static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,3}$";
    public static final String EMPTY_REGEX = "^([^. ][.]*[ ]?)+$";


    public static boolean isPhoneValid(String number) {
        return Pattern.compile(PHONE_REGEX).matcher(number).matches();
    }

    public static boolean isEmailValid(String email) {
        return Pattern.compile(EMAIL_REGEX).matcher(email).matches();
    }

    public static boolean isEmptyValid(String empty){
        return Pattern.compile(EMPTY_REGEX).matcher(empty).matches();
    }
}
