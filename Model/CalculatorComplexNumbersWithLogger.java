package Certification.Model;

import Certification.Model.impl.ComplexNumber;
import Certification.Util.Loggable;

public class CalculatorComplexNumbersWithLogger extends Calculator<ComplexNumber> {
    
    private Calculator<ComplexNumber> calculator;
    private Loggable logger;

    public CalculatorComplexNumbersWithLogger(Calculator<ComplexNumber> calculator, Loggable logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    public Calculator<ComplexNumber> geCalculator() {
        return calculator;
    }

}
