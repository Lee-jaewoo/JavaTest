package streamTest;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest {

    public static void main(String[] args) {

        List<String> sList = new ArrayList<String>();

        sList.add("1");
        sList.add("2");
        sList.add("3");

        sList.stream().forEach(s -> System.out.println(s));
        System.out.println("------------------------------------");
        System.out.println(sList.stream().mapToInt(n -> Integer.parseInt(n)).sum());
        System.out.println("------------------------------------");
        sList.stream().sorted().forEach(s -> System.out.println(s));
        System.out.println("------------------------------------");

        List<String> sList2 = new ArrayList<String>();

        sList2.add("hi~");
        sList2.add("good morning~~~");
        sList2.add("안녕하세요~~");
        sList2.add("반가워요~~");
        sList2.add("greetings~~");

        sList2.stream().sorted().forEach(s -> System.out.println(s));

        System.out.println("------------------------------------");

        sList2.stream().sorted( (o1,o2) -> { if(o1.getBytes().length >= o2.getBytes().length) return 1;
                         else return 0;}).forEach( s -> System.out.println(s + "->" + s.getBytes().length));

        System.out.println("------------------------------------");

        sList2.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.getBytes().length > o2.getBytes().length)     ? -1
                        : (o1.getBytes().length == o2.getBytes().length) ? 0
                        : 1;
            }
        }).forEach(s -> System.out.println(s + "->" + s.getBytes().length));


    }
}
