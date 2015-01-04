package se.budohoor.economics.pos2books.settings;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import se.budohoor.economics.pos2books.model.TxGeneric;
import se.budohoor.economics.pos2books.model.TxLogStatus;
import se.budohoor.economics.pos2books.model.TxType;

@IdClass(TxAuditLogPK.class)
@Entity
@NamedQueries( { @NamedQuery(name = "TxAuditLog.findAll", query = "select o from TxAuditLog o")})
@Table(name = "\"TxAuditLog\"")
public class TxAuditLog implements Serializable {
    @SuppressWarnings("compatibility:-3610268610274603343")
    private static final long serialVersionUID = 1L;
    @Column
    private float timestamp;
    @Id
    @Column
    @Enumerated    
    private TxType txType;
    @Id
    @Column
    private int txId;
    @Column
    private String txPosRef;
    @Column
    @Enumerated
    private TxLogStatus txLogStatus;
    @Column
    private String txBooksRef;
    
    public TxAuditLog() {
        super();
    }
    
    public TxAuditLog(TxGeneric tx) {
        super();
        setTxId(Integer.parseInt(tx.getTxId()));
        setTxType(tx.getTxType());
        setTimestamp(tx.getTxDate());
        setTxPosRef(tx.getPosReference());
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp.getTime()/1000;
    }

    public Date getTimestamp() {
        return new Date(new Double(timestamp * 1000).longValue());
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

    public void setTxPosRef(String txPosRef) {
        this.txPosRef = txPosRef;
    }

    public String getTxPosRef() {
        return txPosRef;
    }

    public void setTxLogStatus(TxLogStatus txLogStatus) {
        this.txLogStatus = txLogStatus;
    }

    public TxLogStatus getTxLogStatus() {
        return txLogStatus;
    }

    public void setTxBooksRef(String txBooksRef) {
        this.txBooksRef = txBooksRef;
    }

    public String getTxBooksRef() {
        return txBooksRef;
    }
}
