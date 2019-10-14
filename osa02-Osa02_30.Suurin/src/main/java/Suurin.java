
public class Suurin {

    public static int suurin(int luku1, int luku2, int luku3) {
        if ((luku1 >= luku2) && (luku1 >= luku3)) {
            return luku1;
        } else if ((luku2 >= luku1) && (luku2 >= luku3)) {
            return luku2;
        } else if ((luku3 >= luku1) && (luku3 >= luku2)) {
            return luku3;
        }
        return 0;
    }

    public static void main(String[] args) {
        int vastaus = suurin(8, 2, 3);
        System.out.println("Suurin: " + vastaus);
    }
}
