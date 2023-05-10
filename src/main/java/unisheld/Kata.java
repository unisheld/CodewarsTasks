package unisheld;

import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(obj -> !(obj instanceof String))
                .collect(Collectors.toList());
    }
}
