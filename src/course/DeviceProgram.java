package course;

import device.ConcretePrinter;
import device.ConcreteScanner;
import entities.ComboDevice;

public class DeviceProgram {
    public static void main(String[] args)  {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My letter");
        p.print("My letter");
        System.out.println("");

        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My email");
        System.out.println("scan result: " +s.scan());

        System.out.println("");

        ComboDevice comboDevice = new ComboDevice("2048");
        comboDevice.processDoc("My dissertation");
        comboDevice.print("My dissertation");
        System.out.println("Scan result" + comboDevice.scan());

    }
}
