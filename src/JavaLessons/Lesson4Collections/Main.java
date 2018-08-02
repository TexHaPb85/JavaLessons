package JavaLessons.Lesson4Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        MyList list = new MyList();
//        List arrayList = new ArrayList();//the simplest class among List implementations
//        List vector = new Vector();//the same as ArrayList, but all methods are synchronized
//        List linkedList = new LinkedList();
//        list.listExample(arrayList);

//        MyQueue myQueue = new MyQueue();
//        myQueue.linkedListRealisatio();
//        myQueue.priorityQueueRealization();

//        MyMap myMap = new MyMap();
//        Map map = new HashMap();
//        Map map1 = new LinkedHashMap();
//        Map map2 = new TreeMap();
//        myMap.fillingMap(map);

        MySet mySet = new MySet();
        Set hashSet = new HashSet();
        Set linkedHashSet = new LinkedHashSet();
        Set treeSet = new TreeSet();
        mySet.fillingSet(linkedHashSet);

    }
}
