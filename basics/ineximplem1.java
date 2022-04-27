package basics;

public class ineximplem1 implements inex1 {

    @Override
    public void Anil() {
        // TODO Auto-generated method stub
        System.out.println("hi Anil");    
    }

    @Override
    public void Hemchand() {
        // TODO Auto-generated method stub
        System.out.println("hi Hemchand");   
    }

    @Override
    public void Lokesh() {
        // TODO Auto-generated method stub
        System.out.println("hi Lokesh");    
    }

    @Override
    public void Vamsi() {
        // TODO Auto-generated method stub
        System.out.println("hi Vamsi");    
    }
public static void main(String[] args) {
    new ineximplem1().Vamsi();
    new ineximplem1().Lokesh();
    new ineximplem1().Anil();
    new ineximplem1().Hemchand();
}    
}
