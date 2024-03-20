package Factory.AbstractFactory.UI;

import java.util.Locale;

public interface GUIAbstractFactory {
    public static IFactory createFactory(String osType){
        if(osType.trim().equalsIgnoreCase("windows")){
            return new WindowFactory();
        }
        else if(osType.trim().equalsIgnoreCase("macbook")){
            return new MacbookFactory();
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}
