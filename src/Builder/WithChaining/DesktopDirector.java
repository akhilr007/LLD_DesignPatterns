package Builder.WithChaining;

public class DesktopDirector {
    public Desktop createDesktop(Builder builder) {
        return builder.buildRam().buildCpu().buildGpu().buildMotherboard().build();
    }
}
