package i_introduction._6_Smart_Casts;

import util.JavaCode;

public class JavaCode6 extends JavaCode {
    public String print(Expr expr) {
        if (expr instanceof Num) {
            return "" + expr;
        }
        if (expr instanceof Sum) {
            Sum sum = (Sum) expr;
            return print(sum.getLeft()) + " + " + sum.getRight();
        }
        throw new IllegalArgumentException("Unknown expression");
    }
}
