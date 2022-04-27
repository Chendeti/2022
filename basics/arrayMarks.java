package basics;

public class arrayMarks {
    public static void main(String[] args) {
        
        int[] arr = new int[10];

        arr[0] = 90;
        arr[1] = 91;
        arr[2] = 92;
        arr[3] = 93;
        arr[4] = 94;
        arr[5] = 95;
        arr[6] = 96;
        arr[7] = 97;
        arr[8] = 98;
        arr[9] = 99;

        //max, min marks
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum " + min + " \nMaximum" + max);

        //average marks
        int avg = 0;
        for (int i : arr) {
          avg=(avg+i);
        }
        System.out.println("Average = " + avg/10);
    }
}
         
        
