
public class NegativeNumberInStrings {

    public static void NegativeNumberInStrings(String str) {

        String temp = "";

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c == '-') {
                temp = "-";
            }
            else if (Character.isDigit(c)) {
                temp += c;
            }
            else {
                if (temp.length() > 1) {
                    System.out.println(temp);
                }
                temp = "";
            }
        }

        if (temp.length() > 1) {
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {

        String s = "abc-5xyz-12k9l-p";

        NegativeNumberInStrings(s);
    }
}