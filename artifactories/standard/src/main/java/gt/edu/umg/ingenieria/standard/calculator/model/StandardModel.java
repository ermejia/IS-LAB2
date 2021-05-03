package gt.edu.umg.ingenieria.standard.calculator.model;

public class    StandardModel {
    private String operation;
    private int a;
    private int b;

    public StandardModel() { }

    public StandardModel(String operation) {
        this.operation = operation;
    }

    public StandardModel(int a, int b) {
        this.a = a;
        this.b = b;
    }


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
