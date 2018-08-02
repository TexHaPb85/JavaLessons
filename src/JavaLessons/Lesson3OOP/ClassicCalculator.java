package JavaLessons.Lesson3OOP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ClassicCalculator extends Calculator { //наследование
    private Map mapOfValues;                        //инкапсуляция

    public ClassicCalculator(String name) {
        super(name);
        this.mapOfValues=new HashMap();
    }

    @Override
    void drawGraph() {

    }

    @Override
    public void setValues(){
        char ifContinue;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the operation ere value: '+' '-' '*' '/' ");
            String key = scanner.next();
            System.out.println("Enter the value: ");
            int value = scanner.nextInt();
            mapOfValues.put(key,value);
            System.out.println("enter s if you want to stop ");
            ifContinue=scanner.next().charAt(0);
        }while (ifContinue!='s');
    }

    public String getValues(){
        StringBuilder sb = new StringBuilder();
        Set set = mapOfValues.keySet();
        for (Object string : set){
            sb.append(string);
        }
        return sb.toString();
    }
}
