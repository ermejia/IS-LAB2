package gt.edu.umg.ingenieria.programmer.calculator.model;


public class PrograModel {
    private int a,b,c;
    private String h;

    public PrograModel() {
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public PrograModel(int a, int b, int c, String h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
