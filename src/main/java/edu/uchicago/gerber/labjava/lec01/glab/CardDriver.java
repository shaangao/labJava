package edu.uchicago.gerber.labjava.lec01.glab;

public class CardDriver {
    public static void main(String[] args) {
        Card cardKS = new Card('K', 'S', (byte)10);  // instantiate obj CardKS in the heap; return its *memory addr* (not value) and store it in CardKS
        Card cardQS = new Card('Q', 'S', (byte)10);
        Card cardAS = new Card('A', 'S', (byte)1);

      //  System.out.println(cardKS.toString());

        Player player1 = new Player("Adam", 50_000.09);


        System.out.println(player1.toString());
        System.out.println(cardKS.getFace());






    }
}
