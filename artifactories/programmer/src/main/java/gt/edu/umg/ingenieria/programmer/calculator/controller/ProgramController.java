package gt.edu.umg.ingenieria.programmer.calculator.controller;

import gt.edu.umg.ingenieria.programmer.calculator.model.PrograModel;
import gt.edu.umg.ingenieria.programmer.calculator.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProgramController {

    PrograModel prograModel = new PrograModel();

    @Autowired
    private ProgramService programService;

    @RequestMapping("/programmer")
    public String getCalculatorPage(Model model){
        model.addAttribute("prograModel", prograModel);
        return "ProgramCalculator";
    }

    @RequestMapping(value="/programmer", params="bd", method = RequestMethod.POST)
    public String binarytoDecimal(@ModelAttribute("prograModel") PrograModel prograModel, Model model ){
        if(programService.isbinary(prograModel) == true){
            model.addAttribute("resultb", programService.binaryToDecimal(prograModel));
        }else {
            model.addAttribute("resultb","It is not a binary number");
        }
        return "ProgramCalculator";
    }

    @RequestMapping(value="/programmer", params="bo", method = RequestMethod.POST)
    public String binaryToOctal(@ModelAttribute("prograModel") PrograModel prograModel, Model model ){
        if(programService.isbinary(prograModel) == true){
            model.addAttribute("resultb", programService.binaryToOctal(prograModel));
        }else {
            model.addAttribute("resultb","It is not a binary number\"");
        }
        return "ProgramCalculator";
    }

    @RequestMapping(value="/programmer", params="bh", method = RequestMethod.POST)
    public String binaryToHex(@ModelAttribute("prograModel") PrograModel prograModel, Model model ){
        if(programService.isbinary(prograModel) == true){
            model.addAttribute("resultb", programService.binaryToHex(prograModel));
        }else {
            model.addAttribute("resultb","It is not a binary number");
        }
        return "ProgramCalculator";
    }

    @RequestMapping(value="/programmer", params="db", method = RequestMethod.POST)
    public String decimalToBin(@ModelAttribute("prograModel") PrograModel prograModel, Model model ){
        model.addAttribute("resultd", programService.decimalToBin(prograModel));
        return "ProgramCalculator";
    }

    @RequestMapping(value="/programmer", params="do", method = RequestMethod.POST)
    public String decimalToOct(@ModelAttribute("prograModel") PrograModel prograModel, Model model ){
        model.addAttribute("resultd", programService.decimalToOct(prograModel));
        return "ProgramCalculator";
    }

    @RequestMapping(value="/programmer", params="dh", method = RequestMethod.POST)
    public String decimalToHex(@ModelAttribute("prograModel") PrograModel prograModel, Model model ){
        model.addAttribute("resultd", programService.decimalToHex(prograModel));
        return "ProgramCalculator";
    }

    @RequestMapping(value="/programmer", params="hb", method = RequestMethod.POST)
    public String hexToBin(@ModelAttribute("prograModel") PrograModel prograModel, Model model ){
        model.addAttribute("resulth", programService.hexToBinary(prograModel));
        return "ProgramCalculator";
    }

    @RequestMapping(value="/programmer", params="ho", method = RequestMethod.POST)
    public String hexToOct(@ModelAttribute("prograModel") PrograModel prograModel, Model model ){
        model.addAttribute("resulth", programService.hexToOctal(prograModel));
        return "ProgramCalculator";
    }

    @RequestMapping(value="/programmer", params="hd", method = RequestMethod.POST)
    public String hexToDecimal(@ModelAttribute("prograModel") PrograModel prograModel, Model model ){
        model.addAttribute("resulth", programService.hexToDecimal(prograModel));
        return "ProgramCalculator";
    }

    @RequestMapping(value="/programmer", params="ob", method = RequestMethod.POST)
    public String octalToBin(@ModelAttribute("prograModel") PrograModel prograModel, Model model ){
        model.addAttribute("resulto", programService.octalToBinary(prograModel));
        return "ProgramCalculator";
    }

    @RequestMapping(value="/programmer", params="od", method = RequestMethod.POST)
    public String octalToDecimal(@ModelAttribute("prograModel") PrograModel prograModel, Model model ){
        model.addAttribute("resulto", programService.octalToDecimal(prograModel));
        return "ProgramCalculator";
    }

    @RequestMapping(value="/programmer", params="oh", method = RequestMethod.POST)
    public String octalToHex(@ModelAttribute("prograModel") PrograModel prograModel, Model model ){
        model.addAttribute("resulto", programService.octalToHex(prograModel));
        return "ProgramCalculator";
    }
}
