package Recursion;

public class Number {

    public void recursivelyLowerNumber(int i) {

        System.out.println(i);

        if (i > 0) {
            recursivelyLowerNumber(--i);
        } else {
            System.out.println("Out of numbers :(");
        }
    }
}
