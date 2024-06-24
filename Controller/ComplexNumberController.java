package Certification.Controller;

import Certification.Model.ImaginaryPart;
import Certification.Model.impl.ComplexNumber;
import Certification.Service.ComplexNumberService;

public class ComplexNumberController {
    
    private ComplexNumberService service = new ComplexNumberService();

    public ComplexNumber createComplexNumber(double realPart, ImaginaryPart imaginaryPart) {
        return service.createComplexNumber(realPart, imaginaryPart);
    }
}
