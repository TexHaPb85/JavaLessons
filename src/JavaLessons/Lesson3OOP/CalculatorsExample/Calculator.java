package JavaLessons.Lesson3OOP.CalculatorsExample;

/**
 * We can`t create objects of abstract class
 * Abstract methods haven`t  body and will realized in extended classes
 *
 * Абстрактный класс — это класс, содержащий хотя бы один абстрактный метод, он описан в программе, имеет поля,
 * методы и не может использоваться для непосредственного создания объекта.
 * То есть от абстрактного класса можно только наследовать. Объекты создаются только на основе производных классов,
 * наследованных от абстрактного. Например, абстрактным классом может быть базовый класс «сотрудник вуза», от которого
 * наследуются классы «аспирант», «профессор» и т. д. Так как производные классы имеют общие поля и функции
 * (например, поле «год рождения»), то эти члены класса могут быть описаны в базовом классе. В программе создаются
 * объекты на основе классов «аспирант», «профессор», но нет смысла создавать объект на основе класса «сотрудник вуза».
 *
 */
abstract public class Calculator {
    private String inputData;

    public Calculator(String input) {
        this.inputData = input;
    }

    abstract void drawGraph();

    abstract public void setValues();  //like in interface method has no body and will describe in extended classes

    public String getAnsers(){return "";}

    protected String getNameOfCalculator(){
        return inputData;
    }
}
