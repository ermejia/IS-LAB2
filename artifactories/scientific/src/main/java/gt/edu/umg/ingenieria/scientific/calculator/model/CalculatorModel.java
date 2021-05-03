package gt.edu.umg.ingenieria.scientific.calculator.model;

public class CalculatorModel {
    private String operation;
    private int a;
    private int b;

    public CalculatorModel() { }

    public CalculatorModel(String operation) {
        this.operation = operation;
    }

    public CalculatorModel(int a, int b) { this.a = a; this.b = b; }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
