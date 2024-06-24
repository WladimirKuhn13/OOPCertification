package Certification.Model;

public class ImaginaryPart {

    private double number;

    private static char i = 'i';

    public ImaginaryPart(double number) {
        this.number = number;
    }

    public String getImaginaryParts() {
        return String.valueOf(number) + i;
    }

    @Override
    public String toString() {
        String result = "";

        if (number > 0) {
            result = "+" + String.valueOf(number) + i;
        }
        else if (number < 0) {
            result = String.valueOf(number) + i;
        }
        return result;
    }
}
