package programmers.level2.zip;

public class StringZip {

//    public static String s = "aabbaccc";
    public static String s = "ababcdcdababcdcd";
    public static void main(String[] args) {


        int result = 1001;
        int count;
        int start;
        int end;
        System.out.println(s.length());
         for (int i = 1; i < s.length(); i++) {
            count = 1;
            end = i;
            start = 0;
            StringBuilder sb = new StringBuilder();
             while (end + i <= s.length()) {
                 System.out.println(start + " : " + end);
                 System.out.println(s.substring(start, end));
                 if (end + i >= s.length()) {

                 }
                 if (s.substring(start, end).equals(s.substring(start + i, end + i))) {
//                    System.out.println(s.substring(start, end));
//                    System.out.println(s.substring(start+i, end+i));
                     ++count;
                 } else {
                     if (count != 1) {
                         sb.append(count).append(s.substring(start, end));
                         count = 1;
                     } else {
                         sb.append(s.substring(start, end));
                     }
                 }
                 start += i;
                 end += i;
//                System.out.println(end + s.substring(start, end));
             }
             if (count != 1) {
                 sb.append(count).append(s.substring(start));
                 count = 1;
             } else {
                 sb.append(s.substring(start));
             }

             result = Math.min(result, sb.toString().replace("1", "").length());
     //       System.out.println(sb.toString().replace("1", ""));
//            System.out.println(sb);
        }
        System.out.println(result);
    }
}
