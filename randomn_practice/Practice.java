package randomn_practice;

public class Practice {
    public static void main(String[] args) {
        String str = "AACECAAAA";

        StringBuilder s = new StringBuilder();

        s.append(str);
        String rev = s.reverse().toString();
        s.reverse().append("$").append(rev);

        System.out.println(s);
    }
}
