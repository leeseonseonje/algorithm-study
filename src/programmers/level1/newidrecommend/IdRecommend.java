package programmers.level1.newidrecommend;

import java.util.Locale;

public class IdRecommend {

    //    public static String new_id = "...!@BaT#*..y.abcdefghijklm";
    public static String new_id = "abcdefghijklmn.p";
    String zz = "#!";

    public static void main(String[] args) {

        //1
        new_id = new_id.toLowerCase(Locale.ROOT);

        //2
        StringBuilder newId = new StringBuilder();
        for (int i = 0, n = new_id.length(); i < n; i++) {
            char c = new_id.charAt(i);
            System.out.println(c);
            if (Character.isLetterOrDigit(c) || (c == '-') || (c == '_') || (c == '.')) {
                newId.append(c);
            }
        }

        //3
        for (int i = 1; i < newId.toString().length(); i++) {
            if (newId.toString().charAt(i) == '.' && newId.toString().charAt(i - 1) == '.') {
                newId.deleteCharAt(i);
                i--;
            }
        }

        //4
        if (newId.toString().startsWith(".")) {
            newId.deleteCharAt(0);
        }
        if (newId.toString().endsWith(".")) {
            newId.deleteCharAt(newId.length() - 1);
        }

        //5
        if (newId.toString().isEmpty()) {
            newId.append("a");
        }

        //6
        System.out.println(newId.length());
        String s = "";
        if (newId.length() > 15) {
            newId.delete(15, newId.length());
            if (newId.toString().endsWith(".")) {
                newId.deleteCharAt(newId.length() - 1);
            }
        }

        if (newId.length() <= 2) {
            System.out.println("Zz");
            for (int i = newId.length() - 1; i < 2; i++) {
                newId.append(newId.charAt(i));
            }
        }
        System.out.println(newId);
    }
}
