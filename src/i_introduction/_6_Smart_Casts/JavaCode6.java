package i_introduction._6_Smart_Casts;

import util.JavaCode;

public class JavaCode6 extends JavaCode {
    public int eval(Expr expr) {
        if (expr instanceof Num) {
            return ((Num) expr).getValue();
        }
        if (expr instanceof Sum) {
            Sum sum = (Sum) expr;
            return eval(sum.getLeft()) + eval(sum.getRight());
        }
        throw new IllegalArgumentException("Unknown expression");
    }
}
