package cs1302.calc;

/* Implement the Math interface using recursion here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * REPLACE ME WITH ACTUAL JAVADOC FOR THIS CLASS.
 *
 * @author AUTHOR
 */
public class RecursiveMath implements Math {

    public int inc(int n) {
       return  ++n;
    } // inc

    public int dec(int n) {
        return --n;
    } // dec

    public int add(int lhs, int rhs) {
        if(rhs == 0) return lhs;
	return add(inc(lhs), dec(rhs));

    } // add

    public int sub(int lhs, int rhs) {
        if(rhs == 0) return lhs;
	return sub(dec(lhs), dec(rhs));
    } // sub

    public int mul(int lhs, int rhs) {
	if(rhs == 0) return 0;
	if(rhs == 1) return lhs;
	return add(lhs, mul(lhs, dec(rhs)));
    } // mul
    public int mul_acc(int lhs, int rhs, int acc){
	if(rhs == 0) return 0;
	if(rhs == 1) return lhs;
	return mul_acc(add(lhs, acc), rhs, acc);
    }
    public int div(int lhs, int rhs) {
        throw new UnsupportedOperationException();
    } // div

    public int fac(int n) {
        throw new UnsupportedOperationException();
    } // fac

    public int pow(int lhs, int rhs) {
        throw new UnsupportedOperationException();
    } // pow

} // RecursiveMath
