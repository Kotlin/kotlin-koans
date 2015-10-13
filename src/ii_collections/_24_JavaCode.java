package ii_collections;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import util.JavaCode;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class _24_JavaCode extends JavaCode {
    public Collection<String> doSomethingStrangeWithCollection(Collection<String> collection) {
        Map<Integer, List<String>> groupsByLength = Maps.newHashMap();
        for (String s : collection) {
            List<String> strings = groupsByLength.get(s.length());
            if (strings == null) {
                strings = Lists.newArrayList();
                groupsByLength.put(s.length(), strings);
            }
            strings.add(s);
        }

        int maximumSizeOfGroup = 0;
        for (List<String> group : groupsByLength.values()) {
            if (group.size() > maximumSizeOfGroup) {
                maximumSizeOfGroup = group.size();
            }
        }

        for (List<String> group : groupsByLength.values()) {
            if (group.size() == maximumSizeOfGroup) {
                return group;
            }
        }
        return null;
    }
}
