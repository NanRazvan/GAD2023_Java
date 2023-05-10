package Patterns.builder;

public class Main {
    public static void main(String[] args) {

        Computer.Builder comp = new Computer.Builder("MotherBoard","I9")
                .setRAM(32)
                .setColor("RED")
                .setVideo("nVIDIA");

        Computer computer = comp.build();
        System.out.println(computer);
    }

}
