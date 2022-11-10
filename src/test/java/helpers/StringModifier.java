package helpers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringModifier {
    public static String getUniqueString(String str) {
        return str + new SimpleDateFormat("yyyy-MM-dd_HHmmss").format(new Date());
    }
}
