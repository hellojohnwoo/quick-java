package chap07.sec03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static String getCurrentData(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }

    public static void main(String[] args) {
        System.out.println(Util.getCurrentData("yyyyMMdd"));

    }
}
