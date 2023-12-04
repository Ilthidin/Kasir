package form;

import java.text.NumberFormat;
import java.util.Locale;

public class Helper {
    public static NumberFormat numberFormatHelper() {
        return NumberFormat.getNumberInstance(new Locale("in", "ID"));
    }
}