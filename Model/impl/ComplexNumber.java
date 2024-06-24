package Certification.Model.impl;

import Certification.Model.ImaginaryPart;
import Certification.Model.SomeNumber;

public class ComplexNumber extends SomeNumber{

    ImaginaryPart imaginaryPart;
    

    public ComplexNumber(double realPart, ImaginaryPart imaginaryPart) {
        super(realPart);
        this.imaginaryPart = imaginaryPart;
        
    }

    public double getRealPart(){
        return realPart;
    }

    public ImaginaryPart getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public String toString() {
        String complexNumber = Double.toString(realPart) + this.getImaginaryPart();
        return complexNumber;
    }

    
}
