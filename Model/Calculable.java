package Certification.Model;

import java.util.List;

public interface Calculable<T extends SomeNumber> {

    T sum(T a, T b);
    T multiply(T a, T b);
    T divide(T a, T b);
    void result();
    void clear();
    
} 
