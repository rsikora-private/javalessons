package vavr;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.collection.HashSet;
import io.vavr.collection.List;
import io.vavr.collection.Set;
import io.vavr.collection.Stream;
import io.vavr.control.Either;
import io.vavr.control.Try;

public class VavrLesson {

    //1. Immutable Collections
    final List<String> immutableList = List.of("1", "2", "3");

    final Set<Tuple2<String, Integer>> tuples = HashSet.of(Tuple.of("Robert", 32), Tuple.of("Mirek", 31));


    public void testImmutableList() {
        immutableList.append("4");

        final Tuple2<String, Integer> tuple = Tuple.of("Robert", 32);
        System.out.println(tuple._1);
        System.out.println(tuple._2);
    }

    //2. Try
    public double divideSafe(final double a, final double b) {
        return Try.of(() -> divideUnsafe(a, b)).getOrElse(0d);
    }

    private double divideUnsafe(final double a, final double b) throws Exception {
        if(b == 0) {
            throw new Exception("B cannot be 0 !");
        }
        return a / b;
    }

    public List<Integer> testTry() {
        return Stream.of("23;","123", "12", "4", "werwer")
                .map(t -> Try.of(() -> Integer.valueOf(t)/2))
                .filter(Try::isSuccess)
                .map(Try::get)
                .collect(List.collector());
    }
    //3. Either
    final Either<Integer, String> either = null;
}
