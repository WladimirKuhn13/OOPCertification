package Certification.Service;
import java.util.List;
import Certification.Model.ImaginaryPart;

public class ImaginaryPartService {

    public ImaginaryPart createImaginaryPart (double number) {
        
        ImaginaryPart imaginaryPart = new ImaginaryPart(number);
        return imaginaryPart;
    }
}
