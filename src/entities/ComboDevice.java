package entities;

import device.Devices;
import device.Printer;
import device.Scanner;

public class ComboDevice extends Devices implements Scanner, Printer {
    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo processing " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("combo printing " + doc);
    }

    @Override
    public String scan() {
        return "Combo scan result";
    }
}
