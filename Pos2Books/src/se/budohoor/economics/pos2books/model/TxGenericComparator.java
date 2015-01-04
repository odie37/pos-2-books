package se.budohoor.economics.pos2books.model;

import java.util.Comparator;

public class TxGenericComparator implements Comparator<TxGeneric> {
    public TxGenericComparator() {
        super();
    }

    @Override
    public int compare(TxGeneric o1, TxGeneric o2) {
        return o1.getTxDate().compareTo(o2.getTxDate());
    }
}
