package se.budohoor.economics.pos2books.plugins.pos.ringitup;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries( { @NamedQuery(name = "Note.findAll", query = "select o from Note o") })
@Table(name = "\"notes\"")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "note_type", discriminatorType = DiscriminatorType.INTEGER)
public abstract class Note implements Serializable {
    @Column(name = "hide_date")
    private int hideDate;
    @Column(name = "note")
    private String note;
    @Column(name = "note_date")
    private float noteDate;
    @Id
    @Column(name = "pk")
    private int noteId;
    @Column(name = "note_is_private")
    private int noteIsPrivate;
    @Column(name = "note_type")
    @Enumerated
    private NoteType noteType;
    @Column(name = "fk_parent_record_id")
    private int parentRecordId;

    public Note() {
    }

    public Note(int hideDate, String note, float noteDate, int noteId, int noteIsPrivate, NoteType noteType,
                int parentRecordId) {
        this.hideDate = hideDate;
        this.note = note;
        this.noteDate = noteDate;
        this.noteId = noteId;
        this.noteIsPrivate = noteIsPrivate;
        this.noteType = noteType;
        this.parentRecordId = parentRecordId;
    }


    public int getHideDate() {
        return hideDate;
    }

    public void setHideDate(int hideDate) {
        this.hideDate = hideDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public float getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(float noteDate) {
        this.noteDate = noteDate;
    }

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public int getNoteIsPrivate() {
        return noteIsPrivate;
    }

    public void setNoteIsPrivate(int noteIsPrivate) {
        this.noteIsPrivate = noteIsPrivate;
    }

    public NoteType getNoteType() {
        return noteType;
    }

    public void setNoteType(NoteType noteType) {
        this.noteType = noteType;
    }

    public int getParentRecordId() {
        return parentRecordId;
    }

    public void setParentRecordId(int parentRecordId) {
        this.parentRecordId = parentRecordId;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("hideDate=");
        buffer.append(getHideDate());
        buffer.append(',');
        buffer.append("note=");
        buffer.append(getNote());
        buffer.append(',');
        buffer.append("noteDate=");
        buffer.append(getNoteDate());
        buffer.append(',');
        buffer.append("noteId=");
        buffer.append(getNoteId());
        buffer.append(',');
        buffer.append("noteIsPrivate=");
        buffer.append(getNoteIsPrivate());
        buffer.append(',');
        buffer.append("noteType=");
        buffer.append(getNoteType());
        buffer.append(',');
        buffer.append("parentRecordId=");
        buffer.append(getParentRecordId());
        buffer.append(']');
        return buffer.toString();
    }
}
