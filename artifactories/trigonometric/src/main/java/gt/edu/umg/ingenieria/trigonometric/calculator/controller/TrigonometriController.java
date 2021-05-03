package gt.edu.umg.ingenieria.trigonometric.calculator.controller;

import gt.edu.umg.ingenieria.trigonometric.calculator.model.TrigonometricModel;
import gt.edu.umg.ingenieria.trigonometric.calculator.service.TrigonometricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TrigonometriController {
    TrigonometricModel trigonometricModel = new TrigonometricModel();

    @Autowired
    private TrigonometricService trigonometricService;

    @RequestMapping("/trigonometric")
    public String getCalculatorPage(Model model){
        model.addAttribute("trigonometricModel", trigonometricModel);
        return "TrigonometriCalculator";
    }

    @RequestMapping(value="/trigonometric", params="sin", method = RequestMethod.POST)
    public String sin(@ModelAttribute("trigonometricModel") TrigonometricModel trigonometricModel, Model model ){
        model.addAttribute("result", trigonometricService.sin(trigonometricModel));
        return "TrigonometriCalculator";
    }

    @RequestMapping(value="/trigonometric", params="cos", method = RequestMethod.POST)
    public String cos(@ModelAttribute("trigonometricModel") TrigonometricModel trigonometricModel, Model model ){
        model.addAttribute("result", trigonometricService.cos(trigonometricModel));
        return "TrigonometriCalculator";
    }

    @RequestMapping(value="/trigonometric", params="tan", method = RequestMethod.POST)
    public String tan(@ModelAttribute("trigonometricModel") TrigonometricModel trigonometricModel, Model model ){
        model.addAttribute("result", trigonometricService.tan(trigonometricModel));
        return "TrigonometriCalculator";
    }

    @RequestMapping(value="/trigonometric", params="sec", method = RequestMethod.POST)
    public String sec(@ModelAttribute("trigonometricModel") TrigonometricModel trigonometricModel, Model model ){
        model.addAttribute("result", trigonometricService.sec(trigonometricModel));
        return "TrigonometriCalculator";
    }

    @RequestMapping(value="/trigonometric", params="cosec", method = RequestMethod.POST)
    public String cosec(@ModelAttribute("trigonometricModel") TrigonometricModel trigonometricModel, Model model ){
        model.addAttribute("result", trigonometricService.cosec(trigonometricModel));
        return "TrigonometriCalculator";
    }

    @RequestMapping(value="/trigonometric", params="cotg", method = RequestMethod.POST)
    public String cotg(@ModelAttribute("trigonometricModel") TrigonometricModel trigonometricModel, Model model ){
        model.addAttribute("result", trigonometricService.cotg(trigonometricModel));
        return "TrigonometriCalculator";
    }
}
