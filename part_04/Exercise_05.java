package part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */


public class Exercise_05 {

    public static void main(String[] strings) {
        int [] finobacci = new int[30];
        finobacci[0]=0;
        finobacci[1]=1;
        for (int i = 2; i <finobacci.length ; i++) {
            finobacci[i] = finobacci [i-1] + finobacci [i-2];
        }
        for (int a : finobacci){
            System.out.print(a + " ");
        }
    }
}