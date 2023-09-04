import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> namelist = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida", "shimamura");

        namelist.forEach(System.out::println);
    }
}