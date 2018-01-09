/**
 *
 * @author I20869
 */
package Sample;

import java.awt.*;
import java.awt.event.*;
import static java.lang.Character.isDigit;
import javax.swing.*;

public class Circularq extends JFrame implements ActionListener {

    JTextField txtInput;
    String strDisplay = "";
    JButton btnInsert, btnRemove, btnExit;
    JLabel lblMessage, lblOutput;
    final int SIZE = 5;
    private int iArray[] = new int[SIZE];
    private int iFront = 0;
    private int iEnd = 0;

    /* This constructor initialises all the elements before execution*/
    Circularq() {
        setTitle("Queue");
        setLayout(new FlowLayout());
        txtInput = new JTextField(10);
        add(txtInput);
        btnInsert = new JButton("Insert");
        add(btnInsert);
        btnInsert.addActionListener(this);
        btnRemove = new JButton("Remove");
        add(btnRemove);
        btnRemove.addActionListener(this);
        btnExit = new JButton("Exit");
        add(btnExit);
        btnExit.addActionListener(this);
        lblMessage = new JLabel("Message");
        lblOutput = new JLabel();
        add(lblMessage);
        add(lblOutput);

    }

    /* Instance creation and setting the frame size and visibility mode*/
    public static void main(String args[]) {
        Circularq f = new Circularq();
        f.setSize(500, 500);
        f.setVisible(true);

    }

    /**
     * @param : Takes the button that has been clicked by the user as input.
     * @return : Returns the correponding function to be performed.
     *
     */
    public void actionPerformed(ActionEvent ae) throws NumberFormatException {
        if (ae.getSource() == btnInsert) {
            //int iValue = Integer.parseInt(txtInput.getText());
            int iValue = 0;

            try {

                iValue = Integer.parseInt(txtInput.getText());

            } catch (NumberFormatException e) {
                System.out.println("Exception");
            }
            push(iValue);
        } else if (ae.getSource() == btnRemove) {
            pop();
        } else if (ae.getSource() == btnExit) {
            System.exit(0);
        }
    }

    /**
     * This function inserts the elements given as input into the queue.
     *
     * @param : Takes the values given by the user as input.
     * @return : Returns the elements present in the queue after pushing.
     *
     */
    boolean push(int iValue) throws NumberFormatException {
        if (!isFull()) {
            iArray[iEnd] = iValue;
            txtInput.setText("");
            iEnd = (iEnd + 1) % SIZE;
        } else {
            iEnd = 0;
            iArray[iEnd] = iValue;
            iEnd = (iEnd + 1) % SIZE;

        }
        for (int i = 0; i < SIZE; i++) {
            strDisplay = strDisplay + " " + iArray[i];
        }
        lblOutput.setText(strDisplay);
        strDisplay = "";
        return true;
    }
    int y;

    /**
     * This function removes the elements from the queue.
     *
     * @param : Nil.
     * @return : Returns the elements present in the queue after removing.
     *
     */
    int pop() {
        if (!isEmpty()) {
            y = iArray[iFront];
            iArray[iFront] = 0;
            iFront = (iFront + 1) % SIZE;

        } else {

            iArray[iFront] = 0;
            y = iArray[iFront];
            iFront = (iFront + 1) % SIZE;

        }

        for (int i = iFront; i < SIZE; i++) {
            strDisplay = strDisplay + " " + iArray[i];

        }
        lblOutput.setText(strDisplay);
        strDisplay = "";
        return y;
    }

    int peek() {
        int iPeek = iArray[iFront];
        return iPeek;
    }

    /**
     * This function checks whether the queue is full.
     *
     * @param : Nil.
     * @return : Returns true or false.
     *
     */
    boolean isFull() {
        return (iEnd == SIZE);
    }

    /**
     * This function checks whether the queue is empty.
     *
     * @param : Nil.
     * @return : Returns true or false.
     *
     */
    boolean isEmpty() {
        return (iEnd == iFront);
    }

}
