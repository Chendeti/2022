public class caseexmpl {
    public static void main(String[] args) {
        int i = 30;
        //if i = 0 hello, 1 hello world, 2 Vamsi, 3 hello again
        switch (i) {
            case 0:
                System.out.println("Hello");
                break;
            case 1:
                System.out.println("Hello world");
                break;
            case 2:
                System.out.println("Vamsi");
                break;
            case 3:
                System.out.println("Hello again");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }

    }
}
        
