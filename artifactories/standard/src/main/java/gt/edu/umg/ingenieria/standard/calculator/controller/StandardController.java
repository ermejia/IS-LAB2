package gt.edu.umg.ingenieria.standard.calculator.controller;

import gt.edu.umg.ingenieria.standard.calculator.model.StandardModel;
import gt.edu.umg.ingenieria.standard.calculator.service.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StandardController {
    StandardModel standardModel = new StandardModel();

    @Autowired
    private StandardService standardService;

    @RequestMapping("/standard")
    public String getCalculatorPage(Model model){
        model.addAttribute("standardModel", standardModel);
        return "StandardCalculator";
    }

    @RequestMapping(value="/standard", params="add", method = RequestMethod.POST)
    public String add(@ModelAttribute("standardModel") StandardModel standardModel, Model model ){
        model.addAttribute("result", standardService.add(standardModel));
        return "StandardCalculator";
    }

    @RequestMapping(value="/standard", params="substract", method = RequestMethod.POST)
    public String substract(@ModelAttribute("standardModel") StandardModel standardModel, Model model ){
        model.addAttribute("result", standardService.substract(standardModel));
        return "StandardCalculator";
    }

    @RequestMapping(value="/standard", params="multiply", method = RequestMethod.POST)
    public String multiply(@ModelAttribute("standardModel") StandardModel standardModel, Model model ){
        model.addAttribute("result", standardService.multiply(standardModel));
        return "StandardCalculator";
    }

    @RequestMapping(value="/standard", params="divide", method = RequestMethod.POST)
    public String divide(@ModelAttribute("standardModel") StandardModel standardModel, Model model ){
        model.addAttribute("result", standardService.divide(standardModel));
        return "StandardCalculator";
    }

    @RequestMapping(value="/standard", params="frac", method = RequestMethod.POST)
    public String frac(@ModelAttribute("standardModel") StandardModel standardModel, Model model ){
        model.addAttribute("result", standardService.frac(standardModel));
        return "StandardCalculator";
    }

    @RequestMapping(value="/standard", params="sqrt", method = RequestMethod.POST)
    public String sqrt(@ModelAttribute("standardModel") StandardModel standardModel, Model model ){
        model.addAttribute("result", standardService.sqr(standardModel));
        return "StandardCalculator";
    }

    @RequestMapping(value="/standard", params="exp", method = RequestMethod.POST)
    public String exp(@ModelAttribute("standardModel") StandardModel standardModel, Model model ){
        model.addAttribute("result", standardService.exp(standardModel));
        return "StandardCalculator";
    }

}
