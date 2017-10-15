package Strategy.RecomenderOfBooks;

import Strategy.BookManager.BookManager;
import Strategy.Interfaces.RecomenderOfBooks;

//Strategy of the program(necesary)
public class RecomenderOfDetectiveNovelBooks implements RecomenderOfBooks{

    @Override
    public String recomend()
    {
        BookManager bookManager = BookManager.getInstance();
        String books = bookManager.getBooks("DectiveNovelBooks.txt");
        return books;
    }

}
