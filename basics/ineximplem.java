package basics;

import javax.swing.event.SwingPropertyChangeSupport;

public class ineximplem implements inex {

    @Override
    public void infosys() {
        System.out.println("Hi infosys");
    }

    @Override
    public void tcs() {
        System.out.println("hi tcs");
    }


    @Override
    public void wipro() {
        // TODO Awuto-generated method stub
        System.out.println("hi wipro");
    }

    @Override
    public void zensar() {
        // TODO Auto-generated method stub
        System.out.println("hi zensar");
        
    }
public static void main(String[] args) {
    new ineximplem().zensar();
    new ineximplem().tcs();
    new ineximplem().wipro();
    new ineximplem().infosys();

}
    
}
