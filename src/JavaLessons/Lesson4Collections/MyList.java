package JavaLessons.Lesson4Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MyList {
    List arrayList = new ArrayList();//the simplest class among List implementations
    List vector = new Vector();//the same as ArrayList, but all methods are synchronized
    List linkedList = new LinkedList();//implements Queue, works like Queue,
    // saves first and last objects each of which has links to other objects in this list

    public void listExample(List list){  //список имеет интексы
        System.out.println(list.getClass()+"\n");
        list.add("string object");//0
        list.add(122);//1
        list.add(12);
        list.add('f');
        list.add(52.00/34);
        list.add(true);
        list.set(1,"change");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
