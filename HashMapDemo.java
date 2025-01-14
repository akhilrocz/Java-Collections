
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
    System.out.println(hashMap.get(1));  //value which is not modified
    hashMap.put(1,"Rajesh");
    System.out.println(hashMap.get(1));  //printed modified value
    hashMap.put(2,"Nikhil");
    hashMap.put(3,"Raju");

    System.out.println(hashMap.get(4));  //returns value if value exist, else returns null

    System.out.println(hashMap.containsKey(1));   //containsKey returns true or false
    System.out.println(hashMap.containsKey(4));


    System.out.println("map elements "+hashMap);  //{1=Akhil, 2=Nikhil 3=Raju}
    System.out.println("Entry set view: "+hashMap.entrySet());  //output [1=Akhil, 2=Nikhil 3=Raju]

System.out.println("Hashmap "+hashMap);

Set<Integer> keys =  hashMap.keySet();  //set of keys
System.out.println(keys); //returns a set of keys

    for(int key:hashMap.keySet()){
        String val = hashMap.get(key);
        System.out.println(key + " "+val);
    }
}

}
