import java.util.Arrays;

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
    char chr = args[1].charAt(0);

    //System.out.println(capVowelsLowRest(str));

    // System.out.println(camelCase(str));
    // System.out.println(Arrays.toString(allIndexOf(str, chr)));

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
        String ans = "";
        String fAns = "";
        String FFans = "";

        String result = "";
        boolean foundFirstLetter = false;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ' || foundFirstLetter) {
                result += string.charAt(i);
                foundFirstLetter = true;
            }
        }
        string = result;

        // lower case to all 

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ans = ans + (char) (ch + 32);
            }
            else {
                ans = ans + ch;
            }   
        }

        // upper case if space before word
        for (int i = 0; i < ans.length(); i++) {
            // if (ans.charAt(i) == 32 && ans.charAt(i + 1) != 32) {
            if (ans.charAt(i) == 32 && i < ans.length() - 1 && ans.charAt(i + 1) != 32){
                fAns = fAns + (char) (ans.charAt(i + 1) - 32);
                i++;
            }
            else { 
                fAns = fAns + ans.charAt(i);
            }
        }

        // remove spaces
        for (int i = 0; i < fAns.length(); i++) {
            if (fAns.charAt(i) != 32) {
                FFans += fAns.charAt(i);
            }

        }
        return FFans;
    }
    

    public static int[] allIndexOf(String string, char chr) {
        // string length
        int chrCount = 0;

    // number of appear
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == chr){
                chrCount++;
            }
        }
        int array1[] = new int[chrCount];
        int array_count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr){
                array1[array_count] = i;
                array_count++;
            }
        }
        return array1;
    }
}