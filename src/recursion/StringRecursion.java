package recursion;

public class StringRecursion {

    public static String characterReplace(String s, char originalCharacter, char replacedCharacter) {

        if (s.length() == 0) {
            return s;
        }
        String smallString = characterReplace(s.substring(1), originalCharacter, replacedCharacter);
        if (s.charAt(0) == originalCharacter) {
            return replacedCharacter + smallString;
        } else {
            return s.charAt(0) + smallString;
        }
    }

    public static String removeX(String input) {
        if (input.length() == 0)
            return input;

        String smallString = removeX(input.substring(1));
        if (input.charAt(0) == 'x') {
            return input.replace("x", "");
        } else {
            return input.charAt(0) + smallString;
        }
    }

    public static String removePi(String input) {

        if (input.length() <= 1)
            return input;

        if (input.charAt(0) == 'p' && input.charAt(1) == 'i') {
            // call recusrion on string length n - 2
            String smallString = removePi(input.substring(2));
            return "3.14" + smallString;
        } else {
            // call recusrion on string length n - 1 bcz the string can be "ppiasd"
            String smallString = removePi(input.substring(1));
            return input.charAt(0) + smallString;
        }

    }

    public static boolean palindromCheck(String s, int start, int end) {

        if (start > end)
            return true;
        if (s.charAt(start) == s.charAt(end)) {
            return palindromCheck(s, start + 1, end - 1);
        }
        return false;
    }

    // Time Complexity is O(n/2)
    public static boolean palindromCheck(String s, int start) {

        if (start > s.length() - start - 1)
            return true;
        if (s.charAt(start) == s.charAt(s.length() - start - 1)) {
            return palindromCheck(s, start + 1);
        }
        return false;
    }

    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here
        if (s.length() <= 1)
            return s;

        if (s.charAt(0) == s.charAt(1)) {
            return removeConsecutiveDuplicates(s.substring(1));

        } else {
            String small = removeConsecutiveDuplicates(s.substring(1));
            return s.charAt(0) + small;
        }

    }

    public static void main(String[] args) {
        // System.out.println(characterReplace("Sagarika", 'a', 'y'));
        // System.out.println(removeX("axbxcxdefx"));
        // System.out.println((palindromCheck("MADAM", 0)));
        // System.out.println(removePi("apipi"));
        System.out.println(removeConsecutiveDuplicates("abba"));
    }
}
