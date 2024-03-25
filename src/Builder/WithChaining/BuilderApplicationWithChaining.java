package Builder.WithChaining;

public class BuilderApplicationWithChaining {
    public static void main(String[] args) {

        DesktopDirector director = new DesktopDirector();

        Builder dellBuilder = new DellDesktopBuilder();
        Builder hpBuilder = new HPDesktopBuilder();

        Desktop dellDesktop = director.createDesktop(dellBuilder);
        Desktop hpDesktop = director.createDesktop(hpBuilder);

        System.out.println(dellDesktop.toString());
        System.out.println(hpDesktop.toString());
    }
}
