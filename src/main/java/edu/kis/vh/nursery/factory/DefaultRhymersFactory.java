package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.FifoRhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements RhymersFactory {

    @Override
    public defaultCountingOutRhymer getStandardRhymer() {
        return new defaultCountingOutRhymer();
    }

    @Override
    public defaultCountingOutRhymer getFalseRhymer() {
        return new defaultCountingOutRhymer();
    }

    @Override
    public defaultCountingOutRhymer getFifoRhymer() {
        return new FifoRhymer();
    }

    @Override
    public defaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
