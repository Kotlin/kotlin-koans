package util;

import com.google.common.collect.Sets;

import java.util.Set;

public class JavaCode {
    public static Set<String> set = Sets.newHashSet();

//    private final int i;

    public JavaCode() {
//        this.getClass()
        set.add(this.getClass().getName());
    }
}
