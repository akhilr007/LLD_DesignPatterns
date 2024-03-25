package Builder.WithChaining;

public class HPDesktopBuilder implements Builder {

    private Desktop desktop = new Desktop();
    @Override
    public Builder buildRam() {
        this.desktop.setRam("INTEL RAM");
        return this;
    }

    @Override
    public Builder buildCpu() {
        this.desktop.setCpu("INTEL CPU");
        return this;
    }

    @Override
    public Builder buildGpu() {
        this.desktop.setGpu("INTEL GPU");
        return this;
    }

    @Override
    public Builder buildMotherboard() {
        this.desktop.setMotherboard("INTEL MOTHERBOARD");
        return this;
    }

    @Override
    public Desktop build() {
        return this.desktop;
    }
}
