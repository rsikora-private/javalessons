package java8;

import java.util.Optional;

public class OptionalLesson {

    public Optional<String> getOptional(final boolean isEmpty) {
        return isEmpty? Optional.empty() : Optional.of("some value");
    }
}
