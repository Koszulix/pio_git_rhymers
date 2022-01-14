package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface RhymersFactory {

    public defaultCountingOutRhymer getStandardRhymer();

    public defaultCountingOutRhymer getFalseRhymer();

    public defaultCountingOutRhymer getFifoRhymer();

    public defaultCountingOutRhymer getHanoiRhymer();

}
// alt + strzałki w Intellij to skrót klawiszowy to poruszania się pomiędzy otwartymi plikami