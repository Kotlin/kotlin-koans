package util;

import com.google.common.collect.Sets;

import java.util.Set;

public class JavaCode {
    public static Set<String> set = Sets.newHashSet();

    public JavaCode() {
        set.add(this.getClass().getName());
    }
}
