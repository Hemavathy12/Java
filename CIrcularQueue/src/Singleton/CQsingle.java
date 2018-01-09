/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;


public class CQsingle {

    //creating an object of SingleObject
    private static CQsingle instance = new CQsingle();

    //making the constructor private so that this class cannot be instantiated
    private CQsingle() {
    }

    //Get the only object available
    public static CQsingle getInstance() {
        return instance;
    }
    final int SIZE = 5;
    int[] iQueue = new int[SIZE];

    private int iRear = 0;

    private int iFront = 0;

    /**
     * This function inserts the elements given as input into the queue.
     *
     * @param : Takes the values given by the user as input.
     * @return : Returns the elements present in the queue after pushing.
     *
     */
    public void push(int iValues) {

        iRear = (iRear + 1) % iQueue.length;
        if (iRear == SIZE) {
            //System.out.println("Queue is full."); 
            iRear = 0;
            iQueue[iRear] = iValues;
            iRear = (iRear + 1) % SIZE;

        }
        iQueue[iRear] = iValues;
    }

    /**
     * This function removes the elements from the queue.
     *
     * @param : Nil.
     * @return : Returns the elements present in the queue after removing.
     *
     */
    public int pop() {

        if (iRear == iFront) {
            iQueue[iFront] = 0;
            int iElement = iQueue[iFront];
            iFront = (iFront + 1) % SIZE;

        }
        int iElements = iQueue[iFront];
        iFront = (iFront + 1) % iQueue.length;
        return iElements;
    }

    /**
     * This function displays the elements in the queue.
     *
     * @param : Nil.
     * @return : Displays the elements present in the queue .
     *
     */
    public void display() {
        int iCurr = iFront;
        System.out.print("Queue state: ");
        if (iCurr == iRear) {
            System.out.print("[empty]");
        } else {
            while (iCurr != iRear) {
                iCurr = (iCurr + 1) % iQueue.length;
                System.out.print(iQueue[iCurr] + " ");
            }
        }
        System.out.println();
    }

    public void showMessage() {
        System.out.println("QUEUE");
    }
}
