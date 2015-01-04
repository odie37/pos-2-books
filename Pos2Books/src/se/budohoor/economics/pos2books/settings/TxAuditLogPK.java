package se.budohoor.economics.pos2books.settings;

import java.io.Serializable;

import se.budohoor.economics.pos2books.model.TxType;

public class TxAuditLogPK implements Serializable {
    @SuppressWarnings("compatibility:8178882479841424615")
    private static final long serialVersionUID = 1L;
    
    private TxType txType;
    private int txId;
    
    public TxAuditLogPK() {
        super();
    }

    public TxAuditLogPK(TxType txType, int txId) {
        super();
        this.txType = txType;
        this.txId = txId;
    }

    public void setTxType(TxType txType) {
        this.txType = txType;
    }

    public TxType getTxType() {
        return txType;
    }

    public void setTxId(int txId) {
        this.txId = txId;
    }

    public int getTxId() {
        return txId;
    }
}
