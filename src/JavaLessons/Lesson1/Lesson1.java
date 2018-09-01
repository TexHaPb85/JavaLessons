package JavaLessons.Lesson1;

import java.util.Scanner;

/**
 * @author Misha Yevtusenko
 * @theme conditions and cycles
 */
public class Lesson1 {

    public void cycleExample(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину цыкла:");
        int a = scanner.nextInt();
        for(int i=0;i<a;i++){
            System.out.println("Эта запись выводиться "+(i+1)+"-ый раз");
        }
    }


    public void ifElseConditionCalculator (){
        System.out.println("Welcome to ifElse Condition Calculator:"+'\n');
        char ifContinue;
        do {
            Scanner scanner = new Scanner(System.in);//Создаем переменную для ввода значений с консоли

            System.out.println("Введите  a");//просим пользователя ввести первое значение
            int a = scanner.nextInt();//считываем первое значение введенное в консоль

            System.out.println("Введите операцию '+' '-' '*' '/' ");//просим пользователя ввести операцию
            char op = scanner.next().charAt(0);//считываем операцию с консоли

            System.out.println("Введите b");//просим пользователя ввести второе значение
            int b = scanner.nextInt();//считываем второе значение введенное в консоль

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
                System.out.println("ощибка");
            }
            System.out.println("Хотите продолжить? Ведите 'y' если хотите, либо 'n' если не хотите.");
            ifContinue = scanner.next().charAt(0);
        }while (ifContinue!='n');
    }

    public void switchCaseConditionCalculator (){
        System.out.println("Welcome to switchCase Condition Calculator:"+'\n');
        char ifContinue;
        do {
            Scanner scanner = new Scanner(System.in);//Создаем переменную для ввода значений с консоли

            System.out.println("Введите  a");//просим пользователя ввести первое значение
            int a = scanner.nextInt();//считываем первое значение введенное в консоль

            System.out.println("Введите операцию '+' '-' '*' '/' ");//просим пользователя ввести операцию
            char op = scanner.next().charAt(0);//считываем операцию с консоли

            System.out.println("Введите b");//просим пользователя ввести второе значение
            int b = scanner.nextInt();//считываем второе значение введенное в консоль

            switch (op){
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println(a / b + " остача: " + a % b);
                    break;
                default:
                    System.out.println("Ошибка ввода операции");
                    break;
            }

            System.out.println("Хотите продолжить? Ведите 'y' если хотите, либо 'n' если не хотите.");
            ifContinue = scanner.next().charAt(0);
        }while (ifContinue!='n');
    }


    public static void main(String[] args) {
        Lesson1 lesson1 = new Lesson1();
//        lesson1.cycleExample();
//        lesson1.ifElseConditionCalculator();
        lesson1.switchCaseConditionCalculator();
    }

}
