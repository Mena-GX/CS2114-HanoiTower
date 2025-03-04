package towerofhanoi;

import student.TestCase;

// -------------------------------------------------------------------------
/**
 * Testing the Tower class methods to make sure they work as expected
 * 
 * @author menagdd
 * @version Mar 17, 2024
 */
public class TowerTest
    extends TestCase
{
    // ~ Fields ................................................................
    private Tower tower;
    private Disk disk;

    // ~Public Methods ........................................................
    // ----------------------------------------------------------
    /**
     * Sets up the fields before every test method is run
     */
    public void setUp()
    {
        tower = new Tower(Position.LEFT);
        disk = new Disk(5);
        tower.push(disk);
    }


    // ----------------------------------------------------------
    /**
     * Tests the position() method
     */
    public void testPosition()
    {
        assertEquals(Position.LEFT, tower.position());
    }


    // ----------------------------------------------------------
    /**
     * Tests the push() method
     */
    public void testPush()
    {
        assertEquals(disk, tower.peek());

        Disk disk2 = new Disk(4);

        tower.push(disk2);

        assertEquals(disk2, tower.peek());

        Exception exception = null;
        try
        {
            tower.push(null);
        }
        catch (Exception e)
        {
            exception = e;
        }

        assertNotNull(exception);

        assertTrue(exception instanceof IllegalArgumentException);

        Exception thrown = null;
        try
        {
            tower.push(disk2);
        }
        catch (Exception e)
        {
            thrown = e;
        }

        assertNotNull(thrown);
        assertTrue(thrown instanceof IllegalStateException);

    }

}
