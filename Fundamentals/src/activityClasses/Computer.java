package activityClasses;

public class Computer {
    private Memory memory;
    private Processor processor;
    private String hardDiskCapacity;
    private String operatingSystem;

    public Computer(Memory memory, Processor processor, String hardDiskCapacity, String operatingSystem) {
        this.memory = memory;
        this.processor = processor;
        this.hardDiskCapacity = hardDiskCapacity;
        this.operatingSystem = operatingSystem;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public String getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public void setHardDiskCapacity(String hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "memory=" + memory +
                ", processor=" + processor +
                ", hardDiskCapacity='" + hardDiskCapacity + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer(Memory.DDR1, Processor.I3, "1TB", "Windows 10");
        Computer computer2 = new Computer(Memory.DDR2, Processor.I5, "512GB", "Ubuntu 20.04");
        Computer computer3 = new Computer(Memory.DDR3, Processor.I7, "256GB", "macOS Big Sur");
        Computer computer4 = new Computer(Memory.DDR4, Processor.I9, "1TB", "Windows 10");
        Computer computer5 = new Computer(Memory.DDR5, Processor.I3, "512GB", "Ubuntu 20.04");

        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);
        System.out.println(computer4);
        System.out.println(computer5);
    }
}
