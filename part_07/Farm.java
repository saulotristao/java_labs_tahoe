package part_07;

public class Farm {
    public static void main(String[] args) {


        Cow mimosa = new Cow(36, 500, 1.6, true);
        Horse pocoto = new Horse(34, 600, 1.7, false);
        mimosa.gettingThinner(30);
        pocoto.gettingFatter(50);

        System.out.println(pocoto.getWeight());
        System.out.println(mimosa.getWeight());

    }

}
