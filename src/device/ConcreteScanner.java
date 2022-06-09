package device;

public class ConcreteScanner extends Devices implements Scanner {
    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }
    @Override
    public void processDoc( String doc) {
        System.out.println("Scanner processing: " + doc);
    }
    @Override
    public String scan() {
        return "Scanned content";
    }
}
