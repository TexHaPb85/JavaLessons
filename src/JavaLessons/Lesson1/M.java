package JavaLessons.Lesson1;

import JavaLessons.Lesson2Arrays.Lesson2;

public class M {


    public static void main(String[] args) {
       MyObject myObject = new MyObject(43,"myName");
       MyObject myObject1 = new MyObject();


       myObject1.setAge(43);
       myObject1.setName("myName");
       myObject1.chageVar("235642", 3);


       StringBuilder sb = new StringBuilder();
       sb.append(myObject.getAge());
       sb.append('\n');
       sb.append(myObject.getName());

        StringBuilder sb1 = new StringBuilder();
        sb1.append(myObject1.getAge());
        sb1.append('\n');
        sb1.append(myObject1.getName());


       System.out.println(sb1.toString());
       System.out.println(new String(sb.toString()));



    }
}
