package Assignments;

public class PrimeNumbers {
    public static void main(String[] args) {
    for(int n=1;n<=50;n++) {
        int factor =0;
        for (int i= 1; i <=50; i++) {
            if (n%i == 0) {
                factor++;
            }
        }
        if (factor == 2) {
            System.out.println(n);
        }
    }
    }
}
        
