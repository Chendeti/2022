package Core_Java;

public class lambda {
    public static void main(String[] args) {
        inex in =  () -> System.out.println("Vamsi");
        impl i = new impl();

        i.start();

        in.start();
    }
}
