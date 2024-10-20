package Examples;
import java.util.List;
import java.util.Optional;
import java.util.Arrays;

public class OptionalExample {
    public static void main(String[] args) {
        List<String> langArrr=Arrays.asList("Java","Python","c++","Rust","Go");

        Optional<String> lang = langArrr.stream()
                                .filter(str-> str.contains("+"))
                                .findAny();    //can also use findFirst

        // String lang = langArrr.stream()
        //                         .filter(str-> str.contains("+"))
        //                         .findAny()
        //                         .orElse("lang not found"); without wrapping in optional

        System.out.println(lang.orElse("lang not found")); // using optional and handling err
    }
}
