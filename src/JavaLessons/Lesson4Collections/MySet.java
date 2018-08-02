package JavaLessons.Lesson4Collections;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set - is a collection where contains elements that do`t repeat
 * HashSet contains own object in as hash code, we can`t predict the order in which will be recorded elements of HashSet
 * LinkedHashSet is orderly(упорядкована)
 * i.e. LinkedHashSet contains elements in the order(порядок) in which they were recorded(записані)
 * TreeSet is sorted, we can choose what algorithm of sorting will use
 *
 */
public class MySet {
    Set hashSet = new HashSet();
    Set linkedHashSet = new HashSet();
    Set treeSet = new TreeSet();

    public void fillingSet(Set set ){
        System.out.println(set.getClass());
        set.add(45);
        set.add(2);
        set.add(1);
        set.add(5);
        set.add(1);
        set.add(1);
        set.add(7);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        for (Object o : set){
            System.out.println(o);
        }
    }

}
