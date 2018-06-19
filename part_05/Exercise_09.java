package part_05;

import part_03.Exercise_02;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

class Exercise_09{

    public static void main(String[] args) {
        Exercise_09 obj = new Exercise_09();
        obj.sayGoodBye("Saulo");
        System.out.println();
        obj.sayGoodBye("Brian", "Duncan");
        System.out.println();
        obj.sayGoodBye("Nami", "Ryan", "Alex");
        System.out.println();

    }

    public void sayGoodBye (String ... varargs){
        for (String a: varargs) {
            System.out.println("GoodBye + " + a);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Goodbye ");

        for (String a: varargs) {
            sb.append(a + ",");
        }
        System.out.println(sb.toString());
    }


}


