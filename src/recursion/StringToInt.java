package recursion;

public class StringToInt {
    private static int convertStringToInt(String input, int len) {

        if (input.length() == 1)
            return (int) input.charAt(0);

        return (int) (input.charAt(0)) * (int) (Math.pow(10, len - 1))
                + convertStringToInt(input.substring(1), len - 1);
    }

    public static void main(String[] args) {
        int ans = convertStringToInt("1234", 4);
        System.out.println(ans);

    }
}
