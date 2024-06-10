public class AddString {
    public static void main(String[] args) {
        System.out.println(repeatChar("The")); // "TThhee"
        System.out.println(repeatChar("AAbb")); // "AAAAbbbb"
        System.out.println(repeatChar("Hi-There")); // "HHii--TThheerree"
    }
    public static String repeatChar(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            char theChar = str.charAt(i);
            newString += "" + theChar + theChar;
        }
        return newString;
    }
}
