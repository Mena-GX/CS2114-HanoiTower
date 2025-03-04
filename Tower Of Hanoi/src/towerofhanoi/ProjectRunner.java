package towerofhanoi;

// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 * 
 * @author menagdd
 * @version Mar 17, 2024
 */
public class ProjectRunner
{
    // ~ Fields ................................................................

    // ~ Constructors ..........................................................

    // ~Public Methods ........................................................
    // ----------------------------------------------------------
    /**
     * Main method that runs the project
     * 
     * @param args
     *            arguments for running the main method. Input only one which
     *            will be the amount of disks for the puzzle
     */
    public static void main(String[] args)
    {
        int disks = 6;

        if (args.length == 1)
        {
            disks = Integer.parseInt(args[0]);
        }
        HanoiSolver hs = new HanoiSolver(disks);
        @SuppressWarnings("unused")
        PuzzleWindow pw = new PuzzleWindow(hs);
    }

}
