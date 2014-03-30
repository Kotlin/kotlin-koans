package i_introduction._6_Smart_Casts;

import util.JavaCode;

public class JavaCode6 extends JavaCode {
    public String print(Expr expr) {
        if (expr instanceof Num) {
            return "" + ((Num) expr).getValue();
        }
        if (expr instanceof Sum) {
            Sum sum = (Sum) expr;
            return print(sum.getLeft()) + " + " + print(sum.getRight());
        }
        throw new IllegalArgumentException("Unknown expression");
    }
}
