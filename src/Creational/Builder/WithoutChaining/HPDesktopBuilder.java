package Creational.Builder.WithoutChaining;

public class HPDesktopBuilder implements Builder {

    private Desktop desktop;

    HPDesktopBuilder(){
        this.desktop = new Desktop();
    }

    @Override
    public void buildRam() {
        this.desktop.setRam("HP Ram");
    }

    @Override
    public void buildCpu() {
        this.desktop.setCpu("HP Cpu");
    }

    @Override
    public void buildGpu() {
        this.desktop.setGpu("HP Gpu");
    }

    @Override
    public void buildMotherboard() {
        this.desktop.setMotherboard("HP Motherboard");
    }

    @Override
    public Desktop build() {
        return desktop;
    }
}
