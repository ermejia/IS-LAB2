package gt.edu.umg.ingenieria.standard.calculator.service;

import gt.edu.umg.ingenieria.standard.calculator.model.StandardModel;
import org.springframework.stereotype.Service;

@Service
public class StandardService {

    public int add(StandardModel model){
        return model.getA() + model.getB();
    }
    public int substract(StandardModel model){
        return model.getA()-model.getB();
    }
    public float divide(StandardModel model){
        return model.getA()/model.getB();
    }
    public int multiply(StandardModel model){
        return model.getA()*model.getB();
    }
    public double frac(StandardModel model){
        return 1/(double)model.getA();
    }
    public double sqr(StandardModel model){
        return Math.sqrt(model.getA());
    }
    public double exp(StandardModel model){
        return Math.pow(model.getA(),model.getB());
    }
}
