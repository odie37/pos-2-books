package se.budohoor.economics.pos2books.plugins.pos.ringitup;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("5")
public class ExpenseNote extends Note {
    public ExpenseNote(int i, String string, float f, int i1, int i2, NoteType noteType, int i3) {
        super(i, string, f, i1, i2, noteType, i3);
    }

    public ExpenseNote() {
        super();
    }
}
