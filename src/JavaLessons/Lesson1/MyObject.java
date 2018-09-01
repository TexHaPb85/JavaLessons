package JavaLessons.Lesson1;

public class MyObject {

    private int age;
    private String name;

    public MyObject(int age, String name) {
            this.age = age*2;
            this.name = name+"343243242";
    }

    public MyObject() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void chageVar(String s, int i){
        this.name=this.name+s;
        this.age=this.age*i;
    }

    public void dsg(String s){
        System.out.println(s);
    }

}
