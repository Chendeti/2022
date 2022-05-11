package Assignments;

public interface Maths {
    public void add(int a,int b);
}

class M implements Maths {

    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        M m = new M();
        m.add(3, 3);
    }
}
    
