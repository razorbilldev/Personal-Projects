package com.najimov.modules.solid.interfacesegregation.printer;

public class OldPrinter implements Printer {
    @Override
    public void printDocument() {
        System.out.println("Printing...");
    }

    @Override
    public void scanDocument() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void faxDocument() {
        throw new UnsupportedOperationException();
    }
}
