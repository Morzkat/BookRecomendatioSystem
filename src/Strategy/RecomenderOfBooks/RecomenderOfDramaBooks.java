package Strategy.RecomenderOfBooks;

import Strategy.BookManager.BookManager;
import Strategy.Interfaces.RecomenderOfBooks;

//Strategy of the program(necesary)
public class RecomenderOfDramaBooks implements RecomenderOfBooks
{
    @Override
    public String recomend()
    {
        BookManager bookManager = BookManager.getInstance();
        String books = bookManager.getBooks("DramaBooks.txt");
        return books;
    }

}
