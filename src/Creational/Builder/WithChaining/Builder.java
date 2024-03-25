package Creational.Builder.WithChaining;


public interface Builder {
    Builder buildRam();
    Builder buildCpu();
    Builder buildGpu();
    Builder buildMotherboard();

    Desktop build();
}