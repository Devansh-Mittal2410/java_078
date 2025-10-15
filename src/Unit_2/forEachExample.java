package Unit_2;

import java.util.ArrayList;
import java.util.List;

public class forEachExample {
    public static void main(String[] args) {
        List<String> games = new ArrayList<>();
        games.add("Football");
        games.add("Cricket");
        games.add("Chess");
        games.add("Hockey");
        games.forEach(System.out::println);
    }
}
