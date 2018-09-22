package JavaLessons.Lesson1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RightValuesCalculator extends  Calculator {

    public void ifElseConditionCalculator (){
        boolean rightA = false;
        boolean rightB = false;
        System.out.println("Welcome to ifElse Condition Calculator:"+'\n');
        char ifContinue;
        do {
            int a=0;
            do{
                try {
                    Scanner scannerA = new Scanner(System.in);//Создаем переменную для ввода значений с консоли
                    System.out.println("Введите  a");//просим пользователя ввести первое значение
                    a= scannerA.nextInt();//считываем первое значение введенное в консоль
                    rightA=true;
                }catch (Exception e){
                    System.out.println("Не коректное значение а, введите еще раз");
                }
            }while (rightA!=true);



            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите операцию '+' '-' '*' '/' ");//просим пользователя ввести операцию
            char op = scanner.next().charAt(0);//считываем операцию с консоли


            int b=0;
            do{
                try {
                    Scanner scannerB = new Scanner(System.in);//Создаем переменную для ввода значений с консоли
                    System.out.println("Введите b");//просим пользователя ввести второе значение
                    b = scannerB.nextInt();//считываем второе значение введенное в консоль
                    rightB=true;
                }catch (Exception e){
                    System.out.println("Не коректное значение b, введите еще раз");
                }
            }while (rightB!=true);


            /////////////////////ПРОЦЕНДУРА ВЫСЧИТЫВАНИЯ//////////////////////////////
            if (op == '+') {
                System.out.println(a + b);
            } else if (op == '-') {
                System.out.println(a - b);
            } else if (op == '*') {
                System.out.println(a * b);
            } else if (op == '/') {
                System.out.println(a / b + " остача: " + a % b);
            } else { //ни одно из выше указаных условий не имело места быть а значит пользователь ввел не правильную оперцию
                System.out.println("Ощибка введенной операции");
            }


            System.out.println("Хотите продолжить? Ведите 'y' если хотите, либо 'n' если не хотите.");
            ifContinue = scanner.next().charAt(0);
        }while (ifContinue!='n');
    }

}
