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

    // public static String removePi(String input) {

    // }

    public static void main(String[] args) {
        System.out.println(characterReplace("Sagarika", 'a', 'y'));
        System.out.println(removeX("axbxcxdefx"));
    }
}
