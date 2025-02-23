package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    private final defaultCountingOutRhymer temp = new defaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())

            getTemp().countIn(super.countOut());

        int ret = getTemp().countOut();

        while (!getTemp().callCheck())

            countIn(getTemp().countOut());

        return ret;
    }

    public defaultCountingOutRhymer getTemp() {
        return temp;
    }
}
//Setters that are not needed just didn't create.