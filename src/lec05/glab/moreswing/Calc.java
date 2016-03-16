package lec05.glab.moreswing;

import lec09.glab.structs.Queue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: ag
 * Date: 10/28/13
 * Time: 9:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class Calc {
    private JTextField mTextField;
    private JButton m7Button;
    private JButton m4Button;
    private JButton m8Button;
    private JButton m5Button;
    private JButton m9Button;
    private JButton m6Button;
    private JButton m1Button;
    private JButton m2Button;
    private JButton m3Button;
    private JButton m0Button;
    private JButton mButtonPlus;
    private JButton mButtonEqual;
    private JButton mButtonDiff;
    private JButton mButtonMult;
    private JButton mButtonDiv;
    private JPanel mPanel;
    private JButton mButtonClear;


    //my members
    private ActionListener mActionListener;
    private List<String> mVals;
    private double mTemp, mTotal;
    private String mOp;



    public static void main(String[] args) {
        JFrame frame = new JFrame("Calc");
        frame.setContentPane(new Calc().mPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public Calc() {
        //do any initialization

        mVals = new ArrayList<>();

        //create and put any listeners
        mActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String strButtonText =  ((JButton)e.getSource()).getText();

                if (strButtonText.equalsIgnoreCase("C")){
                    mTextField.setText("");
                    mVals.clear();
                    mOp = null;
                    mTemp = 0;
                    mTotal = 0;
                    return;
                }

                //equals sign
                if (strButtonText.equalsIgnoreCase("=")){

                    mVals.add(mTextField.getText());
                  //  mVals.add(strButtonText);
                    mTextField.setText("");


                    while (!mVals.isEmpty()){

                        String strVal = mVals.remove(0);
                        if (isNumeric(strVal)){
                            mTemp = Double.parseDouble(strVal);
                            if (mOp == null) {
                                mTotal = mTemp;
                                continue;
                            }

                            switch (mOp){
                                case "+":
                                    mTotal += mTemp;
                                    break;
                                case "-":
                                    mTotal -= mTemp;
                                    break;
                                case "*":
                                    mTotal *= mTemp;
                                    break;
                                case "/":
                                    mTotal /= mTemp;
                                    break;
                            }


                        } else {
                            //assign the previous operation
                            mOp = strVal;
                        }

                    }
                    mTextField.setText(String.valueOf(mTotal));
                    mOp = null;
                    mTemp = 0;
                    mTotal = 0;
                }

                else {



                    //numeric entry or .
                    if (isNumeric(strButtonText)){
                        mTextField.setText(mTextField.getText() + strButtonText);
                    }
                    //operator
                    else {
                        mVals.add(mTextField.getText());
                        mVals.add(strButtonText);
                        mTextField.setText("");
                    }


                }



//                try {
//                    int nVal = Integer.parseInt(strButtonText);
//                    mTextField.setText(mTextField.getText() + String.valueOf(nVal));
//                } catch (NumberFormatException e1) {
//
//                    //just set to nothing for now
//                    mTextField.setText("");
//
//                }
            }
        };



        m0Button.addActionListener(mActionListener);
        m1Button.addActionListener(mActionListener);
        m2Button.addActionListener(mActionListener);
        m3Button.addActionListener(mActionListener);
        m4Button.addActionListener(mActionListener);
        m5Button.addActionListener(mActionListener);
        m6Button.addActionListener(mActionListener);
        m8Button.addActionListener(mActionListener);
        m7Button.addActionListener(mActionListener);
        m9Button.addActionListener(mActionListener);
        mButtonPlus.addActionListener(mActionListener);
        mButtonEqual.addActionListener(mActionListener);
        mButtonDiff.addActionListener(mActionListener);
        mButtonMult.addActionListener(mActionListener);
        mButtonDiv.addActionListener(mActionListener);
        mButtonClear.addActionListener(mActionListener);




    }

    //http://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-a-numeric-type-in-java
    public  boolean isNumeric(String str)
    {
        for (char c : str.toCharArray())
        {


            if (!Character.isDigit(c) && c != '.')
                return false;
        }
        return true;
    }


}
