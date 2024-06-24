package Certification.Service.impl;

import java.util.List;
import Certification.Model.Calculator;
import Certification.Model.impl.CalculatorComplexNumbers;
import Certification.Model.impl.ComplexNumber;
import Certification.Service.CalculatorService;
import Certification.Service.ComplexNumberService;
import Certification.Service.ImaginaryPartService;
import Certification.Util.ConvertorFromImaginaryPartToDouble;

public class CalculatorComplexNumbersService extends CalculatorService<ComplexNumber>{

    private ComplexNumberService complexNumberService = new ComplexNumberService();
    private ImaginaryPartService imaginaryPartService = new ImaginaryPartService();
    private ConvertorFromImaginaryPartToDouble convertor = new ConvertorFromImaginaryPartToDouble();
    private Calculator<ComplexNumber> calculator = new CalculatorComplexNumbers();




    @Override
    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        double tempRealNumber = a.getRealPart() + b.getRealPart();
        double tempImaginaryPart = (convertor.convertToDouble(a.getImaginaryPart())
                                    + (convertor.convertToDouble(b.getImaginaryPart())));


        ComplexNumber result = complexNumberService.createComplexNumber(tempRealNumber, imaginaryPartService.createImaginaryPart(tempImaginaryPart));
        calculator.getResult().add(result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double tempRealNumber = (a.getRealPart() * b.getRealPart()) - (convertor.convertToDouble(a.getImaginaryPart()) * convertor.convertToDouble(b.getImaginaryPart()));

        double tempImaginaryPart = (convertor.convertToDouble(a.getImaginaryPart()) * b.getRealPart()) 
                                    + (a.getRealPart() * convertor.convertToDouble(b.getImaginaryPart()));
        ComplexNumber result = complexNumberService.createComplexNumber(tempRealNumber, imaginaryPartService.createImaginaryPart(tempImaginaryPart));
        calculator.getResult().add(result);
        return result;                       
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double tempRealNumber = ((a.getRealPart() * b.getRealPart()) 
                                + (convertor.convertToDouble(a.getImaginaryPart()) * convertor.convertToDouble(b.getImaginaryPart())))
                                / (Math.pow(b.getRealPart(), 2) + Math.pow(convertor.convertToDouble(b.getImaginaryPart()), 2));

        double tempImaginaryPart = ((convertor.convertToDouble(a.getImaginaryPart()) * b.getRealPart()) 
                                    - (a.getRealPart() * convertor.convertToDouble(b.getImaginaryPart()))) 
                                    /(Math.pow(b.getRealPart(), 2) + Math.pow(convertor.convertToDouble(b.getImaginaryPart()), 2));
        ComplexNumber result = complexNumberService.createComplexNumber(tempRealNumber, imaginaryPartService.createImaginaryPart(tempImaginaryPart));
        calculator.getResult().add(result);
        return result; 
    }

    @Override
    public void result() {
        System.out.println(calculator.getResult());
    }

    @Override
    public void clear() {
        calculator.getResult().clear();
    }    
}
