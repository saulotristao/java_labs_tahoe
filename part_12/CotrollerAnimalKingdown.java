package part_12;

public class CotrollerAnimalKingdown {
    public static void main(String[] args) {
        interfaceA horse = (n) -> {

            if (n > 10) {
                return false;
            } else {
                return true;
            }
        };
        System.out.println(horse.canIkillIt(67));
        System.out.println(horse.canIkillIt(5));

        interfaceA cow = (n) -> {
            if (n < 6) {
                return false;
            } else {
                return true;
            }
        };
        System.out.println(cow.canIkillIt(67));
        System.out.println(cow.canIkillIt(5));

        interfaceB rabbit = (n) -> {
            char[] array = n.toCharArray();
            for (char i = 0; i < ((n.length()-1)/2) ; i++) {
                char temp = array[i];
                array[i] = array[n.length()-1-i];
                array[n.length()-1-i] =temp;
            }
            String result = "";
            for (char c: array
                 ) {
                result +=c;
            }
            return result;
        };
        System.out.println(rabbit.reverse("saulo"));

        interfaceB whale = (n) -> {
            char[] array = n.toCharArray();
            char[] newarray = new char[(2*array.length)];
            for (char i = 0; i < (n.length()); i+=1) {
                    newarray[2*i]= array[i];
                    newarray[2*i+1]= array[i];
            }
            String result = "";
            for (char c: newarray
                    ) {
                result +=c;
            }
            return result;
        };
        System.out.println(whale.reverse("saulo"));
    }

}
