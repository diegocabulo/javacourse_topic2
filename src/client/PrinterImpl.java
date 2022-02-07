package client;

import services.Printer;

public class PrinterImpl implements ClientPrinter {

    private Printer printer;

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printDocument() {
        printer.print();
    }
}
