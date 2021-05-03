package gt.edu.umg.ingenieria.scientific.calculator.service;

import gt.edu.umg.ingenieria.scientific.calculator.model.CalculatorModel;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double pi(CalculatorModel model){
        return Math.PI;
    }
    public double exp(CalculatorModel model){ System.out.println(Math.pow(model.getA(),2));
        return Math.pow(model.getA(),2); }
    public double abs(CalculatorModel model){
        return Math.abs(model.getA());
    }
    public double mod(CalculatorModel model){
        return model.getA() % model.getB();
    }
    public long fact(CalculatorModel model){
       return CombinatoricsUtils.factorial(model.getA());
    }
    public double log(CalculatorModel model){
        return Math.log10(model.getA());
    }
    public double logNatural(CalculatorModel model){
        return Math.log(model.getA());
    }
}

