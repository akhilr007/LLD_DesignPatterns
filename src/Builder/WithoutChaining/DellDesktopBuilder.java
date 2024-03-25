package Builder.WithoutChaining;

public class DellDesktopBuilder implements Builder {

    private Desktop desktop;

    DellDesktopBuilder(){
        this.desktop = new Desktop();
    }

    @Override
    public void buildRam() {
        this.desktop.setRam("NVDIA 32GB");
    }

    @Override
    public void buildCpu() {
        this.desktop.setCpu("Dell Cpu");
    }

    @Override
    public void buildGpu() {
        this.desktop.setGpu("Dell Gpu");
    }

    @Override
    public void buildMotherboard() {
        this.desktop.setMotherboard("Dell Motherboard");
    }
    public Desktop build() {
        return desktop;
    }


}
