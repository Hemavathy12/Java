/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author I20869
 */
public class CircularqTest {

    /**
     * Test of actionPerformed method, of class Circularq.
     */
    Circularq queue = new Circularq();
    int iArray[] = {0, 21, 22, 34, 56};

    @Test
    public void testActionPerformed() {
        for (int iIndex = 0; iIndex < 5; iIndex++) {
            queue.push(iArray[iIndex]);
        }

        assertEquals(0, queue.peek());
    }
/* Test for the push() funcion. */
    @Test
    public void testPush() {
        for (int iIndex = 0; iIndex < 5; iIndex++) {
            queue.push(iArray[iIndex]);
        }
        assertEquals(0, queue.peek());
        assertEquals(0, queue.pop());
       // assertFalse(queue.isFull());
          assertFalse(queue.isEmpty());
    }
/* Test for the pop() funcion. */
    @Test
    public void testPop() {
        for (int iIndex = 0; iIndex < 5; iIndex++) {
            queue.push(iArray[iIndex]);
            
        }

        assertEquals(0, queue.pop());
        assertEquals(21, queue.pop());
        assertEquals(22, queue.pop());
        assertFalse(queue.isEmpty());
        queue.push(1);
        assertEquals(34, queue.pop());

    }
/* Test for the isFull() funcion. */
    @Test
    public void testIsFull() {
        assertFalse(queue.isFull());
        queue.push(14);
        assertFalse(queue.isFull());
        queue.push(52);
        assertFalse(queue.isFull());
        queue.push(36);
        assertTrue(queue.isFull());
        queue.pop();
        assertFalse(queue.isFull());
        queue.push(37);
        assertTrue(queue.isFull());
    }
/* Test for the isEmpty() funcion. */
    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.push(1);
        assertFalse(queue.isEmpty());
        queue.pop();
        assertTrue(queue.isEmpty());
    }
}
