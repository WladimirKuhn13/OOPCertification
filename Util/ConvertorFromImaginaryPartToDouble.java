package Certification.Util;
import java.util.List;
import Certification.Model.ImaginaryPart;

public class ConvertorFromImaginaryPartToDouble{

    public double convertToDouble(ImaginaryPart imaginaryPart) {
        return Double.parseDouble(imaginaryPart.getImaginaryParts().replace("i", ""));
    }
    
}
