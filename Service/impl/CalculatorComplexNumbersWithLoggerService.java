package Certification.Service.impl;

import Certification.Model.Calculator;
import Certification.Model.CalculatorComplexNumbersWithLogger;
import Certification.Model.impl.CalculatorComplexNumbers;
import Certification.Model.impl.ComplexNumber;
import Certification.Service.CalculatorService;
import Certification.Util.Loggable;
import Certification.Util.impl.ConsoleLogger;


public class CalculatorComplexNumbersWithLoggerService extends CalculatorService<ComplexNumber> {

    private Calculator<ComplexNumber> calc = new CalculatorComplexNumbers();
    private Loggable logger = new ConsoleLogger();
    private CalculatorComplexNumbersWithLogger calculator = new CalculatorComplexNumbersWithLogger(calc, logger);
    private CalculatorComplexNumbersService calculatorComplexNumbersService = new CalculatorComplexNumbersService();


    @Override
    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        logger.logging(String.format("Умножаю %s на %s", a,b));
        return calculatorComplexNumbersService.sum(a, b);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        logger.logging(String.format("Суммирую %s и %s", a,b));
        return calculatorComplexNumbersService.multiply(a, b);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        logger.logging(String.format("Делю %s на %s", a,b));
        return calculatorComplexNumbersService.divide(a, b);
    }

    @Override
    public void result() {
        logger.logging(String.format("Вывожу результаты всех предыдущих операций"));
        calculator.geCalculator().getResult();
    }

    @Override
    public void clear() {
        logger.logging(String.format("Удаляю результаты операций"));
        calculator.geCalculator().getResult().clear();
    }
    
}
