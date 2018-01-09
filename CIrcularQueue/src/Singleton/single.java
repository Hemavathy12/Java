/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author I20869
 */
public class single {

    public static void main(String[] args) {
        //Get the only object available
        CQsingle object = CQsingle.getInstance();
        int iArray[] = {10, 21, 22, 34};

        //shows the message
        object.showMessage();
        //Pushes the elements into the queue
        for (int iIndex = 0; iIndex < 4; iIndex++) {
            object.push(iArray[iIndex]);
        }
        object.display();
        System.out.println("======================");
        //Pops the elements from the queue
        for (int i = 0; i < 3; i++) {
            object.pop();
        }
        //Random pushes and pops
        object.push(99);
        object.display();
        object.push(13);
        object.push(11);
        object.display();
        System.out.println("======================");

    }
}
