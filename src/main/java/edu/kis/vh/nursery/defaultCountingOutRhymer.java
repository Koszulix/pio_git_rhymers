package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int MAX_SIZE2 = MAX_SIZE - 1;
    private final int[] numbers = new int[MAX_SIZE];

    private static final int EMPTY_TOTAL_RHYMER = -1;
    private int total = EMPTY_TOTAL_RHYMER;

    private static final int DEFAULT_RETURN = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_TOTAL_RHYMER;
    }

    public boolean isFull() {
        return total == MAX_SIZE2;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN;
        return numbers[total--];
    }

}
