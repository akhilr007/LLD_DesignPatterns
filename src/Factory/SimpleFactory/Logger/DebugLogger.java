package Factory.SimpleFactory.Logger;

public class DebugLogger implements ILogger {

    @Override
    public void log() {
        System.out.println("This is debug logger");
    }
}
