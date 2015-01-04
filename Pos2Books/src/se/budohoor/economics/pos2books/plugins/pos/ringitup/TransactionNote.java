package se.budohoor.economics.pos2books.plugins.pos.ringitup;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("0")
public class TransactionNote extends Note {
    public TransactionNote(int i, String string, float f, int i1, int i2, NoteType noteType, int i3) {
        super(i, string, f, i1, i2, noteType, i3);
    }

    public TransactionNote() {
        super();
    }
}
