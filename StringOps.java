public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

    String str = args[0];
    System.out.println(capVowelsLowRest(str));

    }

    public static String capVowelsLowRest (String string) {
        String ans = "";
        String fAns = "";

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ans = ans + (char) (ch + 32);
            }
            else {
                ans = ans + ch;
            }   
        }

        for (int j = 0; j < ans.length(); j++) {
            fAns = fAns + capsVowel(ans.charAt(j));
        }


        return fAns;
    }


    public static String capsVowel (char letter) {
        switch (letter) {
            case 'a':
            return "A";

            case 'e':
            return "E";

            case 'i':
            return "I";

            case 'o':
            return "O";

            case 'u':
            return "U";

            default:
            return String.valueOf(letter);
        }
    }

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }
    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}