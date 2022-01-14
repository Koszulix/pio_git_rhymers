package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface RhymersFactory {

    public defaultCountingOutRhymer GetStandardRhymer();

    public defaultCountingOutRhymer GetFalseRhymer();

    public defaultCountingOutRhymer GetFIFORhymer();

    public defaultCountingOutRhymer GetHanoiRhymer();

}
// alt + strzałki w Intellij to skrót klawiszowy to poruszania się pomiędzy otwartymi plikami