public class Nakashima_TwoStringMethods {

//    public static void main(String[] args) {
////        System.out.println(abcTest("dog"));
////        System.out.println(abcTest("abc"));
////        System.out.println(abcTest("aaabc"));
////        System.out.println(abcTest("a.abc"));
//
//        System.out.println(alternateStirngs("abc" , "xyz"));
//        System.out.println(alternateStirngs("Hi" , "There"));
//        System.out.println(alternateStirngs("xxx" , "Thereee"));
//        System.out.println(alternateStirngs("Thereee" , "xxx"));
//    }

    public static boolean abcTest(String word) {
        int checkpoint = word.indexOf("abc");

        if (word.contains("abc") && (checkpoint == 0 || (!(word.substring(checkpoint - 1, checkpoint).equals("."))))) return true;
        return false;

    }

    public static String alternateStirngs (String str1, String str2) {
        String alternateString = "";

        for (int i = 0; i < str1.length(); i++) {
            if (i >= str2.length()) {
                alternateString += str1.substring(i, i + 1);
            } else alternateString += str1.substring(i , i + 1) + str2.substring(i, i + 1);

            if (i == str1.length() - 1 && str1.length() < str2.length()) {
                alternateString += str2.substring(i + 1);
            }


        }

        return alternateString;
    }
}
