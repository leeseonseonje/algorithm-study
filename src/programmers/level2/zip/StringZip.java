package programmers.level2.zip;

public class StringZip {

    public static String s = "aaaaaaaaaaaaaaaaaaaa";
//    public static String s = "ababcdcdababcdcd";
    public static void main(String[] args) {

        int result = 1001;
        System.out.println(s.length());
         for (int i = 1; i < s.length(); i++) {
            int count = 1;
            int end = i;
            int start = 0;
            StringBuilder sb = new StringBuilder();

             while (end + i <= s.length()) {
                 if (s.substring(start, end).equals(s.substring(start + i, end + i))) {
                     ++count;
                 } else {
                     if (count > 1) {
                         sb.append(count);
                         count = 1;
                     }
                     sb.append(s.substring(start, end));
                 }
                 start += i;
                 end += i;
             }
             if (count > 1) {
                 sb.append(count);
                 count = 1;
             }
             sb.append(s.substring(start));
             result = Math.min(result, sb.length());
        }
        System.out.println(result);
    }
}
