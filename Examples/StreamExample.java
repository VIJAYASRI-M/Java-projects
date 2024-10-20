package Examples;
import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> numsarr=Arrays.asList(4,5,7,3,2,6);

        Stream<Integer> s1=numsarr.stream();
        Stream<Integer> filterStream= s1.filter(n ->n%2==0);
        filterStream.forEach(n -> System.out.println(n));
        /**
         * Implementation
         * 
            Predicate<Integer> p= new Predicate<Integer>() {
                public boolean test(Integer n) {
                    return n%2==0;
                    if(n%2==0)
                        return true;
                    else
                        return false;
                }
            };
                
            Predicate<Integer> p= n-> n%2==0;
            Stream<Integer> filterStream= s1.filter(p);
        *
        */
        System.out.println("----- Filter");

        Stream<Integer> mapStream= numsarr.stream();
        Stream<Integer> mapStreamRes= mapStream.map(n->n*2);
        mapStreamRes.forEach(n -> System.out.println(n));
        /**
         * Implementation
         *
            Function<Integer, Integer> fun= new Function<Integer,Integer>() {
                public Integer apply(Integer n) {
                    return n*2;
                }
            };
                
            Function<Integer,Integer> fun= n-> n*2;
        *
        */

        /* mapToInt example */
        int mapInt = numsarr.parallelStream()
                    .map(n->n*3)
                    .mapToInt(i->i)
                    .sum();
        System.out.println(mapInt);
        System.out.println("----- Map");

        Stream<Integer> reduceStream= numsarr.stream();
        int result=reduceStream.reduce(0,(c,e)->c+e);
        System.out.println(result);
        System.out.println("----- Reduce");

        int result1 = numsarr.stream()
                        .filter(n->n%2!=0)
                        .map(n->n*3)
                        .reduce(0,(a,b)->a+b);
        System.out.println(result1);
        System.out.println("----- combined");

        Stream<Integer> sortedValues = numsarr.stream()
        .filter(n-> n%2==0)
        .sorted();
        sortedValues.forEach(n -> System.out.println(n));
        System.out.println("----- sorted");

        Stream<Integer> parallStream = numsarr.parallelStream()
                                        .filter(n-> n%2==0)
                                        .map(n->n*3);

        parallStream.forEach(n -> System.out.println(n));
        System.out.println("----- parallel");
                                        
    }
}
