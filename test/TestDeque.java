package test;

import collection.Deque;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestDeque {

    @Test
    public void Test(){
        Deque<Integer> d = new Deque<>();
        assertTrue(d.isEmpty());
        d.popFront();
        assertFalse(d.isEmpty());
        assertEquals(1,d.size());
    }

}
