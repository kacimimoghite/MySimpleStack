package dcll.akac.MySimpleStack;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by moghit on 24/02/2016.
 */
public class SimpleStackImlpTest {

    SimpleStack simpleStack;
    String el = new String ("chaine de test");
    Item item = new Item(el);

    @Before
    public void setUp() throws Exception {

        simpleStack = new SimpleStackImlp();


    }

    @Test
    public void testIsEmpty() throws Exception {
        //stack vide
        assertEquals(true,simpleStack.isEmpty());
        assertEquals(0,simpleStack.getSize());
        //stack pas vide
        simpleStack.push(item);
        assertEquals(false,simpleStack.isEmpty());

    }

    @Test
    public void testGetSize() throws Exception {

        //stack est vide
        assertEquals(0,simpleStack.getSize());
        //stack pas vide
        simpleStack.push(item);
        //la taile doit egale à 1
        assertEquals(1,simpleStack.getSize());

    }

    @Test
    public void testPush() throws Exception {

        simpleStack.push(item);

        assertEquals(false,simpleStack.isEmpty());
        assertEquals(1,simpleStack.getSize());
    }

    @Test
    public void testPeek() throws Exception {

    }

    @Test
    public void testPop() throws Exception {

        simpleStack.push(item);
        simpleStack.pop();
        assertEquals(0,simpleStack.getSize());
        assertEquals(true,simpleStack.isEmpty());

    }
}