package com.najimov.modules.solid.interfacesegregation.printer.valid;

public class ModernPrinter implements Printer, Scanner {
    @Override
    public void printDocument() {
        System.out.println("Printing...");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning...");
    }
}
