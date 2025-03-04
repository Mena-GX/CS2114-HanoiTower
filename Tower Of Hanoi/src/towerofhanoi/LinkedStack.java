// Virginia Tech Honor Code Pledge:
// Project 3 Spring 2024
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Ximena Anahi Gomez De Dios (906590905)

package towerofhanoi;

import java.util.EmptyStackException;
import stack.StackInterface;

// -------------------------------------------------------------------------
/**
 * LinkedStack implementation to use for the puzzle. Inner class is Node.
 * 
 * @author menagdd
 * @version Feb 26, 2024
 * @param <T>
 *            The type that will be used in the LinkedStack
 */
public class LinkedStack<T>
    implements StackInterface<T>
{

    // ~ Fields ................................................................
    private int size;
    private Node<T> topNode;

    // ~ Constructors ..........................................................
    @SuppressWarnings("hiding")
    private class Node<T>
    {

        // ~ Fields ............................................................
        private T data;
        private Node<T> next;

        // ~ Constructors ......................................................
        @SuppressWarnings("unused")
        public Node(T entry, Node<T> node)
        {
            this(entry);
            this.setNextNode(node);
        }


        public Node(T data)
        {
            this.data = data;
        }


        // ~ Public Methods ....................................................
        public void setNextNode(Node<T> node)
        {
            next = node;
        }


        public Node<T> getNextNode()
        {
            return this.next;
        }


        public T getData()
        {
            return this.data;
        }
    } // end Node Class

    // ----------------------------------------------------------
    /**
     * Create a new LinkedStack object.
     */
    public LinkedStack()
    {
        topNode = null;
    }


    // ~Public Methods ........................................................
    // ----------------------------------------------------------
    /**
     * Returns the length of the linkedstack
     * 
     * @return the size of the linkedStack
     */
    public int size()
    {
        return size;
    }


    // ----------------------------------------------------------
    /**
     * Returns the string with the contents of the linkedstack
     * 
     * @return a string with the contents of the linkedstack
     */
    public String toString()
    {
        if (topNode == null)
        {
            return "[]";
        }

        String theStr = "[" + topNode.getData();
        Node<T> currNode = topNode.getNextNode();

        while (currNode != null)
        {
            theStr = theStr + ", " + currNode.getData();
            currNode = currNode.getNextNode();
        }

        return theStr + "]";
    }


    // ----------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    @Override
    public void clear()
    {
        topNode = null;
        size = 0;

    }


    // ----------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }


    // ----------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    @Override
    public T peek()
    {
        if (size == 0)
        {
            throw new EmptyStackException();
        }
        return topNode.getData();
    }


    // ----------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    @Override
    public T pop()
    {
        if (size == 0)
        {
            throw new EmptyStackException();
        }

        T savedNode = topNode.getData();
        topNode = topNode.getNextNode();
        size--;

        return savedNode;
    }


    // ----------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    @Override
    public void push(T anEntry)
    {
        Node<T> newNode = new Node<T>(anEntry);

        newNode.setNextNode(topNode);
        topNode = newNode;
        size++;

    }
}
