package ExamplesInClass;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 * This is the main method
 *
 */

public class Example1 {
    public static void main(String[] args) {
        String test = "hamburger";
        System.out.println(test.substring(1,test.length()));

    }

    /**
     * this method multiple the 2 factor
     * @param a - factor a
     * @param b - factor b
     * @return - a times b
     */
    public static double multiple(int a, int b){
        return a*b;
    }
}
