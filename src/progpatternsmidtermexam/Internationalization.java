/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpatternsmidtermexam;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author 2319522
 */
public class Internationalization {
    private static Locale locale = Locale.ENGLISH;
    private static ResourceBundle messages = ResourceBundle.getBundle("progpatternsmidtermexam/Messages", Locale.ENGLISH);

    public static void switchLocale() {
        if (locale.equals(Locale.ENGLISH)) {
            locale = Locale.FRENCH;
        } else {
            locale = Locale.ENGLISH;
        }
        messages = ResourceBundle.getBundle("progpatternsmidtermexam/Messages", locale);
    }

    public static String getMessage(String key) {
        return messages.getString(key);
    }
}
