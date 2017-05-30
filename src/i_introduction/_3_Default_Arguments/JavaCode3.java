package i_introduction._3_Default_Arguments;

import util.JavaCode;

public class JavaCode3 extends JavaCode {
    private int defaultNumber = 42;

    public String foo(String name, int number, boolean toUpperCase) {
        return (toUpperCase ? name.toUpperCase() : name) + number;
    }

    public String foo(String name, int number) {
        return foo(name, number, false);
    }

    public String foo(String name, boolean toUpperCase) {
        return foo(name, defaultNumber, toUpperCase);
    }

    public String foo(String name) {
        return foo(name, defaultNumber);
    }
}