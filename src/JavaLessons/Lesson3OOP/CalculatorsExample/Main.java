package JavaLessons.Lesson3OOP.CalculatorsExample;

import JavaLessons.Lesson3OOP.CalculatorsExample.ClassicCalculator;

/**
 * Абстра́кция  — в объектно-ориентированном программировании это придание объекту характеристик,
 * которые отличают его от всех других объектов, четко определяя его концептуальные границы.
 * Основная идея состоит в том, чтобы отделить способ использования составных объектов данных от деталей их
 * реализации в виде более простых объектов, подобно тому, как функциональная абстракция разделяет
 * способ использования функции и деталей её реализации в терминах более примитивных функций,
 * таким образом, данные обрабатываются функцией высокого уровня с помощью вызова функций низкого уровня.
 *
 *
 * Инкапсуля́ция — свойство языка программирования, позволяющее пользователю не задумываться о сложности реализации
 * используемого программного компонента (что у него внутри?), а взаимодействовать с ним посредством предоставляемого
 * интерфейса (публичных методов и членов), а также объединить и защитить жизненно важные для компонента данные.
 * При этом пользователю предоставляется только спецификация (интерфейс) объекта.
 * Пользователь может взаимодействовать с объектом только через этот интерфейс. Реализуется с помощью ключевого слова: public.
 * Пользователь не может использовать закрытые данные и методы. Реализуется с помощью ключевых слов: private, protected, internal.
 *
 *
 * Наследование — механизм объектно-ориентированного программирования позволяющий описать новый класс на основе уже
 * существующего (родительского), при этом свойства и функциональность родительского класса заимствуются новым классом.
 * Другими словами, класс-наследник реализует спецификацию уже существующего класса (базовый класс).
 * Это позволяет обращаться с объектами класса-наследника точно так же, как с объектами базового класса.
 */
public class Main {
    public static void main(String[] args) {
        ClassicCalculator cc = new ClassicCalculator("classic");
        cc.setValues();
        cc.getNameOfCalculator();
        System.out.println(cc.getValues());
    }
}
