package Certification.Controller;

import Certification.Model.ImaginaryPart;
import Certification.Service.ImaginaryPartService;

public class ImaginaryPartController {
        private ImaginaryPartService service = new ImaginaryPartService();

    public ImaginaryPart createImaginaryPart(double number) {
        return service.createImaginaryPart(number);
    }
}
