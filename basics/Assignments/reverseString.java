package Assignments;

public class reverseString {
    public static String reverse(String s) {
        String str = "";
        // length - 0
        //i-=2 -> i=i-2;
        for (int i = s.length() - 1; i >=0; i-=2) {
            str += s.charAt(i);
        }

        /* for (int i = o; i < str.length(); i++) {
            if(i % 2 == 0) {
                s = s.replace(s.CharAt(i)+"", "");
            }
        } */
        return str;
    }
    public static void main(String[] args) {
        System.out.println(reverse("Rajinikanth"));
    }
}
    
