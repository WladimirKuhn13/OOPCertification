package Certification.Model;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator<T extends SomeNumber> {
    
    protected List<T> result;

    public Calculator() {
        this.result = new ArrayList<>();
    }

    public List<T> getResult() {
        return result;
    }

}
