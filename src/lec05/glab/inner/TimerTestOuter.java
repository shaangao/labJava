package lec05.glab.inner;

import lec05.glab.reflection.Reflector;

import javax.swing.*;
import java.awt.event.ActionListener;


public class TimerTestOuter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		ActionListener lis = new TimePrintOuter();
        //TimePrintOuter lis = new TimePrintOuter();   //this is legal as well
        Reflector.printClass(lis.getClass());

        Timer tim = new Timer(1000, lis);
		tim.start();

		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);
		

	}
	


}//end TimerTest class





