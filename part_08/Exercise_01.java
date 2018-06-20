package part_08;
/*
Write a class with at least one method that uses a try/catch statement. Make sure the catch block is executed, ie
generate an error an catch it in the catch block.
 */

class Exercise_01{
    public static void main(String[] args) {
        try {
            String [] test = new String[5];
            char a = 'A';
            for (int i = 0; i < 5 ; i++) {
                a = (char)(a + i);
                test[i] = String.valueOf(a);
            }
            printArray(test,6);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void printArray(String[] args, int a) throws ArrayIndexOutOfBoundsException {

        for (int i = 0; i < a ; i++) {
            if (i > (args.length-1)){
                throw new ArrayIndexOutOfBoundsException("oi Ryan fala portugues? ");
            }
            System.out.println(args[i]);
        }
    }
}
