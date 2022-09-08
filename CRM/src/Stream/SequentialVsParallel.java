package Stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SequentialVsParallel {
    public static void main(String[] args) {
        List<String> list = List.of("1","2","3","4","5","6","7","8","9","10","11");
        List<String> list1 = List.of("1d","2fad","df3","dafs4","f5","6df","7afdsf","sadf8","sdf9","1df0","11dfd");

        Consumer<String> consumer = s -> {
            System.out.println(Thread.currentThread().getName() + ": " + s);
        };
        /**
         *sequential - ketma ket
         * har bir elementni ketma ket olib beradi
         * */
        Stream<String> sequentialStream = list.stream();
        sequentialStream.forEach(consumer);

        /**
         *parallel - parallel olib beradi
         * Threadlar hosil qilib bir paytni o`zida bir nechta ma`lumot bilan birga ishlaydi
         * */
        System.out.println("--------------------");
        Stream<String> paralleweelStream = list.parallelStream();
        paralleweelStream.forEach(consumer);

        // stream ustida amallar
        Stream<String> sequential = list1.stream();
        Long count = sequential
                .filter(s -> s.length() % 2 ==0)    // toq uzunlikdagilarni o`chiradi
                .distinct()                         // streamda dublikat qiymatlarini o`chiradi
                .count();

        System.out.println(count);
        System.out.println("-------------------------------streamga oid amallar");

        Predicate<String> predicate = s -> s.contains("a");
        sequential = list.stream();
        boolean anyMatch = sequential.anyMatch(predicate);
        System.out.println(anyMatch);

        sequential = list.stream();
        boolean allMatch = sequential.allMatch(predicate);
        System.out.println(allMatch);

        sequential = list.stream();
        boolean noneMatch = sequential.noneMatch(predicate);
        System.out.println(noneMatch);

        sequential = list.stream();
        sequential.filter(predicate)
                        .forEach(System.out::println);
//        System.out.print(anyMatch);



    }
}
