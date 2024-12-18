package Collections;
import java.util.Arrays;
public class Anagram {
    public static void main (String [] args) {
        String str1="top";
        String str2="pot";

        //Converting both the string to lower case.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //Checking for the length of strings
        if (str1.length() != str2.length()) {
            System.out.println("strings are not anagram");
        }
        else {
            //Converting both the arrays to character array
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            //Sorting the arrays using in-built function sort ()
            Arrays.sort(string1);
            Arrays.sort(string2);
            if(Arrays.equals(string1, string2) == true) {
                System.out.println("strings are anagram");
            }
            else {
                System.out.println("strings are not anagram");
            }
        }
    }
}
