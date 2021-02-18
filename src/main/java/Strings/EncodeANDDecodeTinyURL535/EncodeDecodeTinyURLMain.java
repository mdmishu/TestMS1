package Strings.EncodeANDDecodeTinyURL535;

public class EncodeDecodeTinyURLMain {
    public static void main(String[] args) {
        String s = "https://leetcode.com/problems/design-tinyurl";
        EncodeANDDecodeTinyURL ed = new EncodeANDDecodeTinyURL();

        String s1 = ed.encode(s);
        String res = ed.decode(ed.encode(s));

        int kal = 0;

    }
}
