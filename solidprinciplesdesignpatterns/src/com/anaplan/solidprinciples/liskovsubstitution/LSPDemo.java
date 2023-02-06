package com.anaplan.solidprinciples.liskovsubstitution;

public class LSPDemo {

    public void calculateArea(Rectangle r) {
        r.setBreadth(2);
        r.setLength(3);
        System.out.println(r.getArea());
    }

    private String printError(String errorIdentifer, Rectangle r) {
        return "Unexpected value of " + errorIdentifer + "  for instance of " + r.getClass().getName();
    }

    public static void main(String[] args) {
        LSPDemo lsp = new LSPDemo();
        lsp.calculateArea(new Rectangle());
        lsp.calculateArea(new Square());
    }
}
