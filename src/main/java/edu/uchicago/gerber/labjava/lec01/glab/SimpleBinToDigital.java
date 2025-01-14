package edu.uchicago.gerber.labjava.lec01.glab;

/**
 * Created by Adam on 9/26/2016.
 */
public class SimpleBinToDigital {

    //get binary number from user
    //initialize an int nPow to zero; and nResult to zero
    //for each char in string (iterate over the string backwards) exclude the sign bit
        //if the char is 1
            //increment the nResult by 2^nPow
        //increment nPow
    //return nResul

    public static void main(String[] args) {


        String strBinary = "0001 0011";  // 19

                            //2^2     //2^1      // 2^0
                            // first digit: sign bit -- 0 for positive, 1 for negative

        // 1111 1111: -1
        // 1111 1110: -2


        //strip out any spaces
        strBinary = strBinary.replace(" ", "");

        int nPow =0;
        int lResult = 0;

        //for each char in string backwards and skip the sign bit
        for (int nC = strBinary.length()-1; nC > 0 ; nC--) {
            if (strBinary.charAt(nC) == '1') {
                lResult += Math.pow(2, nPow);
            }
           nPow++;
        }
        System.out.println(lResult);

    }
}
