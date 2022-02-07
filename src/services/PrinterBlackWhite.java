package services;


public class PrinterBlackWhite implements Printer {
    @Override
    public void print() {
        System.out.println("Printer: Black and white is printing..");
    }
}
