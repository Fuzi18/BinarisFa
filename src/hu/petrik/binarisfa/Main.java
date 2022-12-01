package hu.petrik.binarisfa;

public class Main {
    public static void main(String[] args) {
        BinarisFa<Integer> bifa = new BinarisFa<>();
        int elemekszama = 69;
        int legkisebb = 1;
        int legnagyobb = 420;
        for (int i = 0; i < elemekszama; i++) {
            int ertek = (int)(Math.random() * (legnagyobb - legkisebb + 1)) + legkisebb;
            bifa.beszur(ertek);

        }
        System.out.println(bifa);
    }
}
