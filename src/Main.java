import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("yamada", "tanaka", "yasuda", "suzuki", "iida");
        List<String> rusult = names.stream().sorted().toList();
        System.out.println(rusult);
    }
}