// Virginia Tech Honor Code Pledge:
// Project 3 Spring 2024
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Ximena Anahi Gomez De Dios (906590905)

package towerofhanoi;

// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 * 
 * @author menagdd
 * @version Feb 26, 2024
 */
public class Tower
    extends LinkedStack<Disk>
{
    // ~ Fields ................................................................
    private Position position;

    // ~ Constructors ..........................................................
    // ----------------------------------------------------------
    /**
     * Create a new Tower object.
     * 
     * @param pos
     *            Position of the tower
     */
    public Tower(Position pos)
    {
        super();
        position = pos;
    }


    // ~Public Methods ........................................................
    // ----------------------------------------------------------
    /**
     * Returns the position of the tower
     * 
     * @return returns a position
     */
    public Position position()
    {
        return position;
    }


    @Override
    public void push(Disk disk)
    {
        if (this.size() == 0)
        {
            super.push(disk);
            return;
        }
        else if (this.peek().compareTo(disk) == 1)
        {
            super.push(disk);
            return;
        }

        if (disk == null)
        {
            throw new IllegalStateException();
        }

        throw new IllegalStateException();
    }

}
