package basics.core_java;

import java.util.HashMap;
import java.util.Map;

public class mapex {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        System.out.println("Map is empty : " + map.isEmpty());

        map.put("Vamsi",12345);
        map.put("Hemchand",123);
        map.put("Vamsi", 999);

        System.out.println("Map is Eampty : " + map.isEmpty());

        System.out.println("Key : Vamsi,Value : " + map.get("Vamsi"));
        System.out.println("Key : Hemchand,Value : " + map.get("Hemchand"));

        System.out.println("Key : Vamsi is there ? " + map.containsKey("Vamsi"));
        System.out.println("Value : 123 is there ? " + map.containsValue(123));

        map.remove("Vamsi");
        System.out.println("Key : Hemchand removed");

        map.put("Neha", 12345678);

        map.forEach((k, v) -> {
            System.out.println("Key : " + k + ", value : " + v);
        });

    }
}



    
