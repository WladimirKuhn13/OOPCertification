package Certification.View;

import java.util.Scanner;
import Certification.Controller.CalculatorComplexNumbersController;
import Certification.Controller.ComplexNumberController;
import Certification.Controller.ImaginaryPartController;
import Certification.Model.ImaginaryPart;
import Certification.Model.impl.ComplexNumber;
import java.util.List;

public class CalculatorComplexNumbersView {

    CalculatorComplexNumbersController calculatorController = new CalculatorComplexNumbersController();
    ImaginaryPartController imaginaryPartController = new ImaginaryPartController();
    ComplexNumberController complexNumberController = new ComplexNumberController();

    public void start() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("Выберите действие: ");
        System.out.println("1 - сложение ");
        System.out.println("2 - умножение ");
        System.out.println("3 - деление ");
        System.out.println("4 - вывести результат ");
        System.out.println("5 - очистить результат ");
        System.out.println("0 - выход ");

        switch (scanner.nextInt()) {
            case 1 -> sum();
            case 2 -> multiply();
            case 3 -> divide();
            case 4 -> result();
            case 5 -> clear();
            case 0 -> System.exit(0);

            default -> System.out.println("Ошибка! Такой операции нет");
            }
        }
    }

    private void sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действительную часть первого числа: ");
        double realPartOfFirstNumber = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого числа: ");
        double imaginaryPartOfFirstNumber = scanner.nextDouble();

        ImaginaryPart firstImaginaryPart = imaginaryPartController.createImaginaryPart(imaginaryPartOfFirstNumber);
        ComplexNumber firstComplexNumber = complexNumberController.createComplexNumber(realPartOfFirstNumber, firstImaginaryPart);

        System.out.println("Введите действительную часть второго числа: ");
        double realPartOfSecondNumber = scanner.nextDouble();
        System.out.println("Введите мнимую часть второго числа: ");
        double imaginaryPartOfSecondNumber = scanner.nextDouble();

        ImaginaryPart secondImaginaryPart = imaginaryPartController.createImaginaryPart(imaginaryPartOfSecondNumber);
        ComplexNumber secondComplexNumber = complexNumberController.createComplexNumber(realPartOfSecondNumber, secondImaginaryPart);

        ComplexNumber result = calculatorController.sum(firstComplexNumber, secondComplexNumber);
        System.out.println("Результат: " + " " + result);
    }

    private void multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действительную часть первого числа: ");
        double realPartOfFirstNumber = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого числа: ");
        double imaginaryPartOfFirstNumber = scanner.nextDouble();

        ImaginaryPart firstImaginaryPart = imaginaryPartController.createImaginaryPart(imaginaryPartOfFirstNumber);
        ComplexNumber firstComplexNumber = complexNumberController.createComplexNumber(realPartOfFirstNumber, firstImaginaryPart);

        System.out.println("Введите действительную часть второго числа: ");
        double realPartOfSecondNumber = scanner.nextDouble();
        System.out.println("Введите мнимую часть второго числа: ");
        double imaginaryPartOfSecondNumber = scanner.nextDouble();

        ImaginaryPart secondImaginaryPart = imaginaryPartController.createImaginaryPart(imaginaryPartOfSecondNumber);
        ComplexNumber secondComplexNumber = complexNumberController.createComplexNumber(realPartOfSecondNumber, secondImaginaryPart);

        ComplexNumber result = calculatorController.multiply(firstComplexNumber, secondComplexNumber);
        System.out.println("Результат: " + " " + result);
    }

    private void divide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действительную часть первого числа: ");
        double realPartOfFirstNumber = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого числа: ");
        double imaginaryPartOfFirstNumber = scanner.nextDouble();

        ImaginaryPart firstImaginaryPart = imaginaryPartController.createImaginaryPart(imaginaryPartOfFirstNumber);
        ComplexNumber firstComplexNumber = complexNumberController.createComplexNumber(realPartOfFirstNumber, firstImaginaryPart);

        System.out.println("Введите действительную часть второго числа: ");
        double realPartOfSecondNumber = scanner.nextDouble();
        System.out.println("Введите мнимую часть второго числа: ");
        double imaginaryPartOfSecondNumber = scanner.nextDouble();

        ImaginaryPart secondImaginaryPart = imaginaryPartController.createImaginaryPart(imaginaryPartOfSecondNumber);
        ComplexNumber secondComplexNumber = complexNumberController.createComplexNumber(realPartOfSecondNumber, secondImaginaryPart);

        ComplexNumber result = calculatorController.divide(firstComplexNumber, secondComplexNumber);
        System.out.println("Результат: " + " " + result);
    }

    private void result() {
        calculatorController.result();
    }

    private void clear() {
        calculatorController.clear();
        System.out.println("Результат обнулен!");
    }
}
