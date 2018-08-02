package JavaLessons.Lesson4Collections;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.*;

/**
 * Dynamic array
 */
public class MyCollection {
    public void simpleCollectionExample(){
        Collection collection = new ArrayList(3); //initial Capacity - початкова ємність
        collection.add("string object");
        collection.add(12);
        collection.add('f');
        collection.add(52.00/34);
        collection.add(true);
        for(Object o : collection){  //upgrade for(){}: creating variable and put the object from the array there
            System.out.println(o);
        }
    }

    public void implementsOfCollectionExample(){
        List list = new ArrayList();
        Set set = new HashSet();
        Queue queue = new PriorityQueue();
        Map map = new HashMap();//map isn`t implements collection
    }
}
