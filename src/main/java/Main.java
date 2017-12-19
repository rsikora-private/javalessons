import lombok.ImmutablePojo;
import lombok.LogService;
import lombok.MutablePojo;

import java.util.Collections;

public class Main {

    public static void main(String ... args) {

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

    }
}
