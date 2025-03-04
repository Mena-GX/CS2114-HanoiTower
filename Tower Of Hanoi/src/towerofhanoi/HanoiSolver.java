// Virginia Tech Honor Code Pledge:
// Project 3 Spring 2024
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Ximena Anahi Gomez De Dios (906590905)

package towerofhanoi;

import java.util.Observable;

// -------------------------------------------------------------------------
/**
 * Creates the tower objects and disks and solves the puzzle
 * 
 * @author menagdd
 * @version Feb 26, 2024
 */
@SuppressWarnings("deprecation")
public class HanoiSolver
    extends Observable
{
    // ~ Fields ................................................................
    private Tower left;
    private Tower middle;
    private Tower right;
    private int numDisks;

    // ~ Constructors ..........................................................
    // ----------------------------------------------------------
    /**
     * Create a new HanoiSolver object.
     * 
     * @param num
     *            the number of disks in the puzzle
     */
    public HanoiSolver(int num)
    {
        numDisks = num;
        left = new Tower(Position.LEFT);
        middle = new Tower(Position.MIDDLE);
        right = new Tower(Position.RIGHT);

    }


    // ~Public Methods ........................................................
    // ----------------------------------------------------------
    /**
     * Returns the number of disks
     * 
     * @return the number of disks
     */
    public int disks()
    {
        return numDisks;
    }


    // ----------------------------------------------------------
    /**
     * Returns the tower based on the position inputted
     * 
     * @param pos
     *            the position of the tower
     * @return the tower in the given position
     */
    public Tower getTower(Position pos)
    {
        if (pos == Position.LEFT)
        {
            return left;
        }
        else if (pos == Position.MIDDLE)
        {
            return middle;
        }
        else if (pos == Position.RIGHT)
        {
            return right;
        }
        return middle;
    }


    // ----------------------------------------------------------
    /**
     * Returns a string of all the towers going from left to right
     * 
     * @return A string of all the towers going from left to right
     */
    public String toString()
    {
        return left.toString() + middle.toString() + right.toString();
    }


    private void move(Tower source, Tower destination)
    {
        destination.push(source.pop());
        setChanged();
        notifyObservers(destination.position());
    }


    private void solveTowers(
        int currDisks,
        Tower startPole,
        Tower tempPole,
        Tower endPole)
    {
        if (currDisks == 1)
        {
            move(startPole, endPole);
            return;
        }

        solveTowers(currDisks - 1, startPole, endPole, tempPole);
        move(startPole, endPole);
        solveTowers(currDisks - 1, tempPole, startPole, endPole);

    }


    // ----------------------------------------------------------
    /**
     * calls the private solveTowers recursive method in order to solve the
     * puzzle
     */
    public void solve()
    {
        solveTowers(numDisks, left, middle, right);
    }
}
