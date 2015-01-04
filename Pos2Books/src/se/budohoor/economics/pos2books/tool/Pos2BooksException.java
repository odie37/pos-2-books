package se.budohoor.economics.pos2books.tool;

public class Pos2BooksException extends RuntimeException {
    public Pos2BooksException(String string, Throwable throwable, boolean b, boolean b1) {
        super(string, throwable, b, b1);
    }

    public Pos2BooksException(Throwable throwable) {
        super(throwable);
    }

    public Pos2BooksException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public Pos2BooksException(String string) {
        super(string);
    }

    public Pos2BooksException() {
        super();
    }
}
