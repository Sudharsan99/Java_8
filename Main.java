package Function;

import java.util.function.Function;

public class Main {

    public static void convertLowerCase()
    {
        Function<String,String> convertName =  (name) -> name.toLowerCase();
        System.out.println(convertName.apply("SUDHARSAN"));
    }
    public static void main(String[] args) {
        Main.convertLowerCase();
    }
}
