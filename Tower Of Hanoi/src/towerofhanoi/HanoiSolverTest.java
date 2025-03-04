// Virginia Tech Honor Code Pledge:
// Project 3 Spring 2024
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Ximena Anahi Gomez De Dios (906590905)
package towerofhanoi;

import java.util.EmptyStackException;
import student.TestCase;

// -------------------------------------------------------------------------
/**
 * Tests the HanoiSolver class methods to make sure they all work as they are
 * supposed to
 * 
 * @author menagdd
 * @version Mar 18, 2024
 */
public class HanoiSolverTest
    extends TestCase
{
    // ~ Fields ................................................................

    private HanoiSolver hs;

    // ~Public Methods ........................................................
    // ----------------------------------------------------------
    /**
     * Sets up the fields before every test method is run
     */
    public void setUp()
    {
        hs = new HanoiSolver(6);
    }


    // ----------------------------------------------------------
    /**
     * Tests the disks() method
     */
    public void testDisks()
    {
        assertEquals(6, hs.disks());
    }


    // ----------------------------------------------------------
    /**
     * Tests the getTower() method
     */
    public void testGetTower()
    {
        Tower tower = hs.getTower(Position.LEFT);
        Tower towerMiddle = hs.getTower(Position.MIDDLE);
        Tower towerRight = hs.getTower(Position.RIGHT);
        // Tower tower = hs.getTower(Position.LEFT);
        assertEquals(tower, hs.getTower(Position.LEFT));
        assertEquals(towerMiddle, hs.getTower(Position.MIDDLE));
        assertEquals(towerRight, hs.getTower(Position.RIGHT));
        assertEquals(towerMiddle, hs.getTower(Position.DEFAULT));
    }


    // ----------------------------------------------------------
    /**
     * tests the toString() method
     */
    public void testToString()
    {
        assertEquals("[][][]", hs.toString());
    }


    // ----------------------------------------------------------
    /**
     * tests the solve() method
     */
    public void testSolve()
    {
        Exception thrown = null;
        try
        {
            hs.solve();
        }
        catch (Exception e)
        {
            thrown = e;
        }

        assertNotNull(thrown);

        assertTrue(thrown instanceof EmptyStackException);
    }
}
