
import java.util.*;
public class HashMapDemo {

public static void main(String[] args) {
    //syntax for creating hashmap
    Map<Integer,String> hashMap = new HashMap<>();
//    hashMap.put(1,1);
//    hashMap.put(2,2);
//    hashMap.put(3,3);
//    System.out.println("Entry set "+hashMap.entrySet());  //entrySet() used for pair view of map

    hashMap.put(1,"Akhil");
    hashMap.put(2,"Nikhil");
    hashMap.put(3,"Raju");

    System.out.println("map elements "+hashMap);
    System.out.println("Entry set view: "+hashMap.entrySet());



}

}
