// Virginia Tech Honor Code Pledge:
// Project 3 Spring 2024
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Ximena Anahi Gomez De Dios (906590905)
package towerofhanoi;

import student.TestCase;

// -------------------------------------------------------------------------
/**
 * Testing the Disk class methods to make sure all methods work as they should
 * 
 * @author menagdd
 * @version Mar 17, 2024
 */
public class DiskTest
    extends TestCase
{
    // ~ Fields ................................................................
    private Disk disk;
    private Disk disk2;

    // ~Public Methods ........................................................
    // ----------------------------------------------------------
    /**
     * Sets up the fields before every test method is run
     */
    public void setUp()
    {
        disk = new Disk(5);
        disk2 = new Disk(6);
    }


    // ----------------------------------------------------------
    /**
     * Tests the compareTo() method
     */
    public void testCompareTo()
    {
        assertEquals(1, disk2.compareTo(disk));
        assertEquals(-1, disk.compareTo(disk2));
        assertEquals(0, disk.compareTo(disk));

        Exception exception = null;
        try
        {
            disk.compareTo(null);
        }
        catch (Exception e)
        {
            exception = e;
        }

        assertNotNull(exception);

        assertTrue(exception instanceof IllegalArgumentException);
    }


    // ----------------------------------------------------------
    /**
     * Tests the toString() method
     */
    public void testToString()
    {
        assertEquals("5", disk.toString());
    }


    // ----------------------------------------------------------
    /**
     * Tests the equals method
     */
    public void testEquals()
    {
        assertTrue(disk.equals(disk));

        assertFalse(disk.equals(null));

        Disk disk3 = new Disk(5);
        assertTrue(disk.equals(disk3));

        assertFalse(disk.equals(disk2));
    }
}
