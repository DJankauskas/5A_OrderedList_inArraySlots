/**
 * Implement a list of diverse types, including integers, double-precision
 * floating point numbers, and Strings.
 */

public class List_inArraySlots {

    private int[] intElements;
    private int filledElements;

    /*
     * type identifier for each element That is, typeOfElements[i] == 0 means
     * element i is an integer; 1 means element i is a double; 2 means element i is
     * a String. Optional extra education in programming (not comp sci): replace
     * these "magic numbers" with an "enumerated type".
     */
    private static final int INITIAL_CAPACITY = 10;

    /**
     * Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        intElements = new int[INITIAL_CAPACITY];
    }

    /**
     * @return the number of elements in this list
     */
    public int size() {
        return filledElements;
    }

    /**
     * @return a string representation of this list, in [a,b,c,] format
     */
    public String toString() {
        String temp = "[";
        for (int index = 0; index < filledElements; index++) {
            temp += (intElements[index] + ",");
        }
        temp += "]";
        return temp;
    }

    /**
     * Appends @value to the end of this list.
     * 
     * @return true, in keeping with conventions yet to be discussed
     */
    public boolean add(int intValue) {
        if (filledElements >= intElements.length) {
            expand();
        }

        intElements[filledElements] = intValue;
        return true;
    }

    public int get(int i) {
        return intElements[i];
    }

    public int set(int i, int val) {
        int temp = get(i);
        intElements[i] = val;
        return temp;
    }

    public boolean add(int i, int val) {
        if (i >= filledElements) {
            add(i);
        }
        if (intElements.length == filledElements) {
            expand();
        }
        shiftElements(1, i);
        set(i, val);
        filledElements++;
        return true;
    }

    public int remove(int i) {
        int old = get(i);
        shiftElements(-1, i);
        filledElements--;
        return old;
    }

    private void expand() {
        // System.out.println( "expand... (for debugging)");

        intElements = copyIntArray(intElements, intElements.length * 2);
    }

    private static int[] copyIntArray(int[] copy, int copyLength) {
        int[] array = new int[copyLength];
        for (int i = 0; i < copy.length; i++) {
            array[i] = copy[i];
        }
        return array;
    }

    private void shiftElements(int direction, int startIndex) {
        if (direction > 0) {
            for (int i = size(); i > startIndex; i--) {
                set(i, get(i - 1));
            }
        }

        if (direction < 0) {
            for (int i = startIndex; i < size() - 1; i++) {
                set(i, get(i + 1));
            }
        }
    }
}