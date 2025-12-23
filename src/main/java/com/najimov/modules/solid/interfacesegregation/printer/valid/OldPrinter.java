package com.najimov.modules.solid.interfacesegregation.printer.valid;

public class OldPrinter implements Printer{
    @Override
    public void printDocument() {
        System.out.println("Printing...");
    }
}
