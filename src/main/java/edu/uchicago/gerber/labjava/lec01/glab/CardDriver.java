package edu.uchicago.gerber.labjava.lec01.glab;

import java.lang.reflect.*;

public class CardDriver {
    public static void main(String[] args) {
//        Card cardKS = new Card('K', 'S', (byte)10);  // instantiate obj CardKS in the heap; return its *memory addr* (not value) and store it in CardKS
//        Card cardQS = new Card('Q', 'S', (byte)10);
//        Card cardAS = new Card('A', 'S', (byte)1);
//
//      //  System.out.println(cardKS.toString());
//
//        Player player1 = new Player("Adam", 50_000.09);
//
//
//        System.out.println(player1.toString());
//        System.out.println(cardKS.getFace());



        Card cardKS = new Card('K', 'S', (byte)10);

        Method[] methods = cardKS.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        Field[] fields = cardKS.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        Constructor<?>[] constructors = cardKS.getClass().getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }





    }
}
