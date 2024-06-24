package Certification.Controller;

import Certification.Model.impl.ComplexNumber;
import Certification.Service.impl.CalculatorComplexNumbersWithLoggerService;

public class CalculatorComplexNumbersWithLoggerController {
    
    CalculatorComplexNumbersWithLoggerService service = new CalculatorComplexNumbersWithLoggerService();

        public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        return service.sum(a, b);
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        return service.multiply(a, b);
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        return service.divide(a, b);
    }

    public void result() {
        service.result();
    }

    public void clear() {
        service.clear();
    }
}
