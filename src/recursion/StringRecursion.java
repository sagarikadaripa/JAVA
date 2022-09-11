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

    public static void main(String[] args) {
        System.out.println(characterReplace("Sagarika", 'a', 'y'));
    }
}
