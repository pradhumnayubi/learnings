package march_8;

import java.util.HashMap;


public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> mp = new HashMap<>(); //use treeMap for sorted and linkedHashMap for preserving
        mp.put("D", 4);
        mp.put("A", 1);
        mp.putIfAbsent("E",5);
        mp.put("B", 2);
        mp.put("C", 3);


        System.out.println(mp);


//        for(HashMap.Entry<String, Integer> e : mp.entrySet()){
//            System.out.println(e);
//            System.out.println(e.getKey());
//        }
    }
}
