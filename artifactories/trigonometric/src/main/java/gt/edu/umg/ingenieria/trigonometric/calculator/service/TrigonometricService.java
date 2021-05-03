package gt.edu.umg.ingenieria.trigonometric.calculator.service;

import gt.edu.umg.ingenieria.trigonometric.calculator.model.TrigonometricModel;
import org.springframework.stereotype.Service;

@Service
public class TrigonometricService {
    public double sin(TrigonometricModel model){
        return Math.sin(model.getA());
    }
    public double cos(TrigonometricModel model){
        return Math.cos(model.getA());
    }
    public double tan(TrigonometricModel model){
        return Math.tan(model.getA());
    }
    public double sec(TrigonometricModel model){
        return 1/Math.cos(model.getA());
    }
    public double cosec(TrigonometricModel model){
        return 1/Math.sin(model.getA());
    }
    public double cotg(TrigonometricModel model){
        return 1/Math.tan(model.getA());
    }
}
