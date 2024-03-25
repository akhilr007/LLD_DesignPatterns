package Builder.WithoutChaining;

public interface Builder {
    void buildRam();
    void buildCpu();
    void buildGpu();
    void buildMotherboard();

    Desktop build();
}
