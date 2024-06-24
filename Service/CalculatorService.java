package Certification.Service;



import java.util.List;

import Certification.Model.Calculable;
import Certification.Model.Calculator;
import Certification.Model.SomeNumber;

public abstract class CalculatorService<T extends SomeNumber> implements Calculable<T>{

    private Calculator<T> calculator;

    public abstract T sum(T a, T b);
    public abstract T multiply(T a, T b);
    public abstract T divide(T a, T b);
    public abstract void result();
    public abstract void clear();
    
    
}
