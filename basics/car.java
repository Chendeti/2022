package basics;

public class car {
       String model;
       int speed;
       double mileage;
       public car(String model, int speed,double mileage){
           this.model = model;
           this.speed = speed;
           this.mileage = mileage;
        }

       @Override
       public String toString() {
           return "model = " + model + "\nSpeed = " + speed + "\nMileage = " + mileage;
        }

       public String getModel() {
           return model;
        }
       public void setModel(String model) {
           this.model = model;
        }
       public int getSpeed() {
           return speed;
        }
       public void setSpeed(int speed) {
           this.speed = speed;
        }
       public double getMileage() {
           return mileage;
        }
       public void setMileage(double mileage) {
           this.mileage = mileage;
        }
    
}
class mainclass {
    public static void main(String[] args) {
        car c1 = new car ("Audi ", 240,  6);
        car c2 = new car ("BMW ", 250, 7);

        c2.setModel("Ferrari");

        System.out.println(c1);
        System.out.println(c2);
    }
}


    