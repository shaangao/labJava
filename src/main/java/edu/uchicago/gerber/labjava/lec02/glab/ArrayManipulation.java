package edu.uchicago.gerber.labjava.lec02.glab;

import java.awt.*;
import java.util.Random;

public class ArrayManipulation {


	public static void main(String[] args) {
	
		
		//this is an array of bytes
		byte[] yAges = new byte[5];
		//the indices are from 0 to 4
		//values are initialized to zero
        System.out.println("printing values stored in yAges");
		for(int nC = 0; nC < yAges.length; nC++) {
			System.out.println(yAges[nC]);
        }
        System.out.println("-----------------------");

		int[] nIds = {5874, 5698, 9981, 1012};
		//this is an array of ints initialzied to above values
		//the indices are from 0 to 3
        System.out.println("printing values stored in nIds");
		for (int nC = 0; nC < nIds.length; nC++) {
			System.out.println(nC + ":" + nIds[nC]);
		}
        System.out.println("-----------------------");

		//nResult is now assigned to 1012;
		int nResult = nIds[3];
        System.out.println("printing value stored in nIds[3]");
		System.out.println(nResult);
        System.out.println("-----------------------");
		//will throw array index out of bounds error at runtime 
		//this will NOT complain at compiletime; you are responsible for 
		//keeping track of how many elements in your array
		//int nResult2 = nIds[4];

        System.out.println("-----------------------");
		String[] strNames = {"Harry", "Larry", "Mary", "Perry"};
		//this has indices from 0 to 3
		
		//traditional way to traverse an array using counter
		for(int nC = 0; nC < strNames.length; nC++){
		     System.out.println(nC + ":" + strNames[nC]);
        }
		
		System.out.println("-----------------------");
		//since Java 5; you can use foreach -- no counters
		//this reads, foreach String element called str in strNames


		for (int nC = 0; nC < strNames.length; nC++) {
			System.out.println(strNames[nC]);
		}

		for (String strName : strNames) {
			System.out.println(strName);
		}





        Rectangle[] recShapes =
		{
				new Rectangle(4,5,8,9),  // "new" returns memory addr
				new Rectangle(7,1,9,12),
				new Rectangle(8,16,1,3)
	
		};



        for (int nC = 0; nC < recShapes.length; nC++) {
		     System.out.println(nC + ":" + recShapes[nC]);
        }
		
		System.out.println("-----------------------");
		
		for (Rectangle rectangle : recShapes){ 
			 System.out.println(rectangle);
		}
		
		
		//we've just created an array with 2 elements
		//these elements have indices 0 and 1
		//each points to null
		Rectangle[] recBoxes = new Rectangle[2];
		
		//iterate over these and print results
		for (Rectangle rectangle : recBoxes) {
			System.out.println(rectangle);
		}
		
		
		Random ran = new Random();
		//assign values to them
		for(int nC = 0; nC < recBoxes.length; nC++){
			int nRan = ran.nextInt(10) + 1; //value from 1 to 10
			recBoxes[nC] = new Rectangle(nC, nC, nRan, nRan);
		}
		
		//iterate over these and print results
		for (Rectangle rectangle : recBoxes) {
			System.out.println(rectangle);
		}
		
		
		
		int[][] nNumbers = new int[3][4];
		for (int nRow = 0; nRow < nNumbers.length; nRow++) {
			for (int nCol = 0; nCol < nNumbers[3].length; nCol++) {
				nNumbers[nRow][nCol] = ran.nextInt(100);
			}
			
		}
		
		
		
		for (int nRow = 0; nRow < nNumbers.length; nRow++) {
			for (int nCol = 0; nCol < nNumbers[0].length; nCol++) {
				 System.out.print(nNumbers[nRow][nCol] + " : ");  
			}
			System.out.println();
		}
		
		
		
		
		//ragged array
		
		boolean[][] bAnswers = {
			
				new boolean[6], // an array of 6 bools
				new boolean[9],
				new boolean[3],
				new boolean[8]

		};


		
		
		for (int nRow = 0; nRow < bAnswers.length; nRow++) {
			for (int nCol = 0; nCol < bAnswers[nRow].length; nCol++) { // check the len of each row
				bAnswers[nRow][nCol] = ran.nextBoolean();
			}
			
		}
		
		
		
		for (int nRow = 0; nRow < bAnswers.length; nRow++) {
			for (int nCol = 0; nCol < bAnswers[nRow].length; nCol++) {
				System.out.print(bAnswers[nRow][nCol] + " : ");
			}
			
			System.out.println();
			
		}
		
		
		

	}

}
