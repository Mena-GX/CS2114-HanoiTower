// Virginia Tech Honor Code Pledge:
// Project 3 Spring 2024
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Ximena Anahi Gomez De Dios (906590905)

package towerofhanoi;

import cs2.*;
import java.awt.Color;
import student.TestableRandom;

// -------------------------------------------------------------------------
/**
 * Creates the disks objects that will be shown on the screen. Disks can be
 * compared to each other
 * 
 * @author menagdd
 * @version Feb 26, 2024
 */
public class Disk
    extends Shape
    implements Comparable<Disk>
{
    // ~ Fields ................................................................

    // ~ Constructors ..........................................................
    // ----------------------------------------------------------
    /**
     * Create a new Disk object.
     * 
     * @param width
     *            The width of the disk
     */
    public Disk(int width)
    {
        super(0, 0, width, PuzzleWindow.DISK_HEIGHT);

        TestableRandom generator = new TestableRandom();
        int ran1 = generator.nextInt(256);
        int ran2 = generator.nextInt(256);
        int ran3 = generator.nextInt(256);
        Color bgColor = new Color(ran1, ran2, ran3);
        super.setBackgroundColor(bgColor);

    }


    // ~Public Methods ........................................................
    // ----------------------------------------------------------
    /**
     * Compare disk objects
     * 
     * @param otherDisk
     *            The disk that is being compared to
     * @return an int depending on whether one disk is bigger than the other
     */
    public int compareTo(Disk otherDisk)
    {
        if (otherDisk == null)
        {
            throw new IllegalArgumentException();
        }

        if (otherDisk.getWidth() == this.getWidth())
        {
            return 0;
        }

        if (this.getWidth() < otherDisk.getWidth())
        {
            return -1;
        }
        return 1;
    }


    // ----------------------------------------------------------
    /**
     * Returns the width of the disk in string object
     * 
     * @return the width of the disk
     */
    public String toString()
    {
        return "" + this.getWidth() + "";
    }


    // ----------------------------------------------------------
    /**
     * Checks if disk objects are equal
     * 
     * @param obj
     *            The obj that is being compared
     * @return whether the disk objects are equal or not
     */
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (obj == null)
        {
            return false;
        }

        if (this.getClass().equals(obj.getClass()))
        {
            Disk other = (Disk)obj;

            if (this.getWidth() == other.getWidth())
            {
                return true;
            }
        }

        return false;
    }

}
