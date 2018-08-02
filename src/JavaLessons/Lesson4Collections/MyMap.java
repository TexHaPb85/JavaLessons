package JavaLessons.Lesson4Collections;

import java.util.*;

/**
 * Map contains objects by their keys
 * HashMap contains own object in as hash code, we can`t predict the order in which will be recorded elements of HashMap
 * The only difference between HashMap and Hashtable is that all methods of Hashtable are synchronized
 * LinkedHashMap is orderly(упорядкована)
 * i.e. LinkedHashMap contains elements in the order(порядок) in which they were recorded(записані)
 * TreeMap is sorted,
 * .put
 * .get
 * .remove
 * .size
 * .isEmpty
 *
 */
public class MyMap {
    Map hashMap = new HashMap();
    Map hashTable = new Hashtable();
    Map linkedHashMap = new LinkedHashMap();
    Map treeMap = new TreeMap();

    public void  fillingMap(Map hashMap){
        System.out.println(hashMap.getClass()+"\n");
        hashMap.put(23,"twenty tree");
        hashMap.put(4,"four");
        hashMap.put(3,"tree");
        hashMap.put(45,"forty five");
        hashMap.put(1,"one");
        hashMap.put(2,"two");
        System.out.println(hashMap.get(3));

        Set entrySet = hashMap.entrySet();
        Set keySet = hashMap.keySet();
        for(Object o : keySet){
            System.out.println(o);
        }
        System.out.println();
        for(Object o : entrySet){
            System.out.println(o);
        }
    }



}
