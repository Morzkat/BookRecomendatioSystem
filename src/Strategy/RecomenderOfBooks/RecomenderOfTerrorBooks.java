package Strategy.RecomenderOfBooks;

import Strategy.BookManager.BookManager;
import Strategy.Interfaces.RecomenderOfBooks;

//Strategy of the program(necesary)
public class RecomenderOfTerrorBooks implements RecomenderOfBooks
{
    @Override
    public String recomend()
    {
        BookManager bookManager = BookManager.getInstance();
        String books = bookManager.getBooks("TerrorBooks.txt");
        return books;
    }

}
