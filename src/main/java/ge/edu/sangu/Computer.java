package ge.edu.sangu;

public class Computer {

    private String CPU;
    private String GPU;
    private String RAM;
    private String SSD;
    private boolean hasSSDEnabled;

    public Computer(ComputerBuilder computerBuilder) {
        this.CPU = computerBuilder.CPU;
        this.GPU = computerBuilder.GPU;
        this.RAM = computerBuilder.RAM;
        this.SSD = computerBuilder.SSD;
        this.hasSSDEnabled = computerBuilder.hasSSDEnabled;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getSSD() {
        return SSD;
    }

    public void setSSD(String SSD) {
        this.SSD = SSD;
    }

    public boolean isHasSSDEnabled() {
        return hasSSDEnabled;
    }

    public void setHasSSDEnabled(boolean hasSSDEnabled) {
        this.hasSSDEnabled = hasSSDEnabled;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", SSD='" + SSD + '\'' +
                '}';
    }

    //Builder Class
    public static class ComputerBuilder{

        private String CPU;
        private String GPU;
        private String RAM;
        private String SSD;
        private boolean hasSSDEnabled;

        public ComputerBuilder(String cpu, String gpu, String ram, String ssd){
            this.CPU=cpu;
            this.GPU=gpu;
            this.RAM=ram;
            this.SSD=ssd;
        }
        
        public ComputerBuilder setHasSSDEnabled(boolean setHasSSDEnabled) {
            this.hasSSDEnabled = setHasSSDEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

}
