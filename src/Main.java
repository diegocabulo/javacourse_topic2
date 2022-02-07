import client.ClientPrinter;
import client.PrinterImpl;
import services.Printer;
import services.PrinterBlackWhite;
import services.PrinterColorAndBW;

public class Main {
    public static void main(String[] args) {
        // Se instancian los tipos de impresora
        Printer printer_BW = new PrinterBlackWhite();
        Printer printer_BWC = new PrinterColorAndBW();
        // Se instancia el cliente que maneja las impresoras
        PrinterImpl printer = new PrinterImpl();

        // La impresora es asignada al cliente
        printer.setPrinter(printer_BW);
        // El cliente maneja el llamado a imprimir de la actul impresora
        printer.printDocument();
        printer.setPrinter(printer_BWC);
        printer.printDocument();
    }
}
