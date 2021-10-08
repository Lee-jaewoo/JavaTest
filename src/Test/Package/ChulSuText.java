package Test.Package;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChulSuText {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Person p = new ChulSu();

        ChulSuText ct = new ChulSuText();

        ct.printResult(p);
    }

    void printResult(Person p) throws InvocationTargetException, IllegalAccessException {

        System.out.println(p.getClass().getName());

        //Method[] c11 = p.getClass().getMethods();
        Method[] c11 = p.getClass().getDeclaredMethods();

        System.out.println(Arrays.stream(c11).count());

        System.out.println("----------------------------");
        boolean result = Arrays.stream(c11).anyMatch(e -> e.getName().equals("walk"));
        System.out.println(result);
        System.out.println("----------------------------");
        Stream<Method> result2 = Arrays.stream(c11).filter(e -> e.getName().length() > 4);
        result2.forEach( e -> System.out.println(e.getName()));
        System.out.println("----------------------------");
        Arrays.stream(c11).forEach( s -> System.out.println(s.getName()) );



        for( int i = 0; i<c11.length ; i++) {
            Method m = c11[i];
            System.out.println(m.invoke(p));
        }
    }
}
