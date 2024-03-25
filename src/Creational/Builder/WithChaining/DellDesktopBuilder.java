package Creational.Builder.WithChaining;

public class DellDesktopBuilder implements Builder {
    private Desktop desktop = new Desktop();

    @Override
    public Builder buildRam() {
       this.desktop.setRam("NVIDIA RAM");
       return this;
    }

    @Override
    public Builder buildCpu() {
        this.desktop.setCpu("NVIDIA CPU");
        return this;
    }

    @Override
    public Builder buildGpu() {
        this.desktop.setGpu("NVIDIA GPU");
        return this;
    }

    @Override
    public Builder buildMotherboard() {
        this.desktop.setMotherboard("NVIDIA MOTHERBOARD");
        return this;
    }

    @Override
    public Desktop build() {
        return this.desktop;
    }
}
