package Creational.Builder.WithoutChaining;

public class DesktopDirector {

    public Desktop createDesktop(Builder builder){
        builder.buildRam();
        builder.buildCpu();
        builder.buildGpu();
        builder.buildMotherboard();
        return builder.build();
    }
}
