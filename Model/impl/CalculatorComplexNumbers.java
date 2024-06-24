package Certification.Model.impl;

import java.util.ArrayList;
import java.util.List;

import Certification.Model.Calculator;

public class CalculatorComplexNumbers extends Calculator<ComplexNumber> {
    
    List<ComplexNumber> result;

    public CalculatorComplexNumbers() {
        this.result = new ArrayList<>();
    }

}
