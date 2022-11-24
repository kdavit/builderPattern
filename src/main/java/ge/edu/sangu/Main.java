package ge.edu.sangu;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder(
                "i9", "RTX 4090", "16 GB", "500 GB").setHasSSDEnabled(true).build();
        System.out.println(computer);
    }
}