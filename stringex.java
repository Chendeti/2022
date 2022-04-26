public class stringex {
    public static void main(String[] args) {
        String s = "Vamsi, is a, coderc";

        //length = 17, 0 - 16
        System.out.println(s.length());
        System.out.println(s.charAt(s.length() -1));
        System.out.println(s.substring(0, 7));
        System.out.println(s.indexOf("c"));
        System.out.println(s.lastIndexOf("c"));
        System.out.println(s.equals("vamsi is a coder"));
        System.out.println(s.replace("Vamsi", "Anil"));


        String[] sarr = s.split(",");

        for (String str : sarr) {
            System.out.println(str);
        }
        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        String str = "";
        for (int i = s.length() - 1; i > 0; i--) {
            str +=s.charAt(i); // i s m a V
        }
        return str;
    }
}
        
