import java8.OptionalLesson;
import lombok.ImmutablePojo;
import lombok.LogService;
import lombok.MutablePojo;
import vavr.VavrLesson;

import java.util.Collections;
import java.util.Optional;

public class Main {

    public static void main(String ... args) {
        //Lombok
        final ImmutablePojo immutablePojo = new ImmutablePojo(123L, "Robert", 32, true);
        System.out.println(immutablePojo);

        final MutablePojo mutablePojo = new MutablePojo(123L, "Robert", 32, true, Collections.emptySet());
        System.out.println(mutablePojo);

        final MutablePojo mutablePojo2 = MutablePojo.builder()
                .id(312L)
                .age(12)
                .part("part 1")
                .part("part 2")
                .build();
        System.out.println(mutablePojo2);

        final LogService logService = new LogService();
        logService.testLog("some entry");

        //Java 8
        final OptionalLesson optionalLesson = new OptionalLesson();
        System.out.println(optionalLesson.getOptional(false).flatMap(t -> Optional.of(t.concat("*"))).get());
        System.out.println(optionalLesson.getOptional(false).map(t -> t.concat("*")).get());

        //Vavr
        final VavrLesson vavrLesson = new VavrLesson();
        vavrLesson.testImmutableList();
        System.out.println(vavrLesson.divideSafe(12, 0));
        System.out.println(vavrLesson.testTry());

    }
}
