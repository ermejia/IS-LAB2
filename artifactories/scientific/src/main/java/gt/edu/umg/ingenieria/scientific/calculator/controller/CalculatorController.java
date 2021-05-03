package gt.edu.umg.ingenieria.scientific.calculator.controller;

import gt.edu.umg.ingenieria.scientific.calculator.model.CalculatorModel;
import gt.edu.umg.ingenieria.scientific.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculatorController {
    CalculatorModel calculateOperation = new CalculatorModel();

    @Autowired
    private CalculatorService scOperations;

    @RequestMapping("/calculate")
    public String getCalculatorPage(Model model){ model.addAttribute("calculateOperation", calculateOperation);
        return "ScientifiCalculator";
    }

    @RequestMapping(value="/calculate", params="pi", method = RequestMethod.POST)
    public String pi(@ModelAttribute("calculateOperation")  CalculatorModel calculateOperation, Model model ){
        model.addAttribute("result", scOperations.pi(calculateOperation));
        return "ScientifiCalculator";
    }

    @RequestMapping(value="/calculate", params="expo", method = RequestMethod.POST)
    public String expo(@ModelAttribute("calculateOperation")  CalculatorModel operationModel, Model model ){
        model.addAttribute("result", scOperations.exp(operationModel));
        return "ScientifiCalculator";
    }

    @RequestMapping(value="/calculate", params="absolute", method = RequestMethod.POST)
    public String absolute(@ModelAttribute("calculateOperation")  CalculatorModel calculateOperation, Model model ){
        model.addAttribute("result", scOperations.abs(calculateOperation));
        return "ScientifiCalculator";
    }

    @RequestMapping(value="/calculate", params="division", method = RequestMethod.POST)
    public String division(@ModelAttribute("calculateOperation")  CalculatorModel calculateOperation, Model model ){
        model.addAttribute("result", scOperations.mod(calculateOperation));
        return "ScientifiCalculator";
    }

    @RequestMapping(value="/calculate", params="factorial", method = RequestMethod.POST)
    public String factorial(@ModelAttribute("calculateOperation")  CalculatorModel calculateOperation, Model model ){
        model.addAttribute("result", scOperations.fact(calculateOperation));
        return "ScientifiCalculator";
    }

    @RequestMapping(value="/calculate", params="logaritm", method = RequestMethod.POST)
    public String logaritmo(@ModelAttribute("calculateOperation")  CalculatorModel calculateOperation, Model model ){
        model.addAttribute("result", scOperations.log(calculateOperation));
        return "ScientifiCalculator";
    }

    @RequestMapping(value="/calculate", params="logarin", method = RequestMethod.POST)
    public String logariN(@ModelAttribute("calculateOperation")  CalculatorModel calculateOperation, Model model ){
        model.addAttribute("result", scOperations.logNatural(calculateOperation));
        return "ScientifiCalculator";
    }
}
