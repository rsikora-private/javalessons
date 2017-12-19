package lombok;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@Builder
@ToString(exclude = {"id"})
public class MutablePojo {

    private long id;
    private String name;
    private int age;
    private boolean isAdmin;
    @Singular private Set<String> parts = new HashSet<>();
    @Getter(lazy=true) private final double[] cached =  expensive();

    private double[] expensive() {
        double[] result = new double[1000000];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.asin(i);
        }
        return result;
    }
}
