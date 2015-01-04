package se.budohoor.economics.pos2books.settings;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries( { @NamedQuery(name = "RunInfo.findAll", query = "select o from RunInfo o"),  
                 @NamedQuery(name = "RunInfo.findLatest", query = "select o from RunInfo o where o.runStart = (select max(p.runStart) from RunInfo p)")})
@Table(name = "\"RunInfo\"")
public class RunInfo implements Serializable {
    @SuppressWarnings("compatibility:-7557205128808445094")
    private static final long serialVersionUID = 1L;
    @Column(name = "firstTxId")
    private int firstTxId;
    @Column(name = "lastTxId")
    private int lastTxId;
    @Column(name = "firstExpId")
    private int firstExpId;
    @Column(name = "lastExpId")
    private int lastExpId;
    @Column(name = "runEnd")
    private float runEnd;
    @Id
    @Column(name = "runStart", nullable = false)
    private float runStart;

    public RunInfo() {
    }

    public RunInfo(int firstTxId, int lastTxId, int firstExpId, int lastExpId, float runEnd, float runStart) {
        this.firstTxId = firstTxId;
        this.lastTxId = lastTxId;
        this.firstExpId = firstExpId;
        this.lastExpId = lastExpId;
        this.runEnd = runEnd;
        this.runStart = runStart;
    }

    public int getFirstTxId() {
        return firstTxId;
    }

    public void setFirstTxId(int firstTxId) {
        this.firstTxId = firstTxId;
    }

    public int getLastTxId() {
        return lastTxId;
    }

    public void setLastTxId(int lastTxId) {
        this.lastTxId = lastTxId;
    }

    public Date getRunEnd() {
        return new Date(new Double(runEnd * 1000).longValue());
    }

    public void setRunEnd(Date runEnd) {
        this.runEnd = runEnd.getTime()/1000;
    }

    public Date getRunStart() {
        return new Date(new Double(runStart * 1000).longValue());
    }

    public void setRunStart(Date runStart) {
        this.runStart = runStart.getTime()/1000;
    }

    public void setFirstExpId(int firstExpId) {
        this.firstExpId = firstExpId;
    }

    public int getFirstExpId() {
        return firstExpId;
    }

    public void setLastExpId(int lastExpId) {
        this.lastExpId = lastExpId;
    }

    public int getLastExpId() {
        return lastExpId;
    }
}
