package Certification.Service;
import java.util.List;
import Certification.Model.ImaginaryPart;
import Certification.Model.impl.ComplexNumber;

public class ComplexNumberService {
    
    public ComplexNumber createComplexNumber (double realPart, ImaginaryPart imaginaryPart) {
        ComplexNumber complexNumber = new ComplexNumber(realPart, imaginaryPart);
        return complexNumber;
    }


}
