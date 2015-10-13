package i_introduction._4_Lambdas;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import util.JavaCode;

import java.util.Collection;

public class JavaCode3 extends JavaCode {
    public boolean task3(Collection<Integer> collection) {
        return Iterables.any(collection, new Predicate<Integer>() {
            @Override
            public boolean apply(Integer element) {
                return element % 42 == 0;
            }
        });
    }
}
