
package Strategy.BookManager;

//importing the packages
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BookManager
{
    //implementing siglenton pattern
    private static BookManager instance;

    //get the instance of the book manager
    public static BookManager getInstance()
    {
        return instance == null ? instance = new BookManager() : instance;
    }

    //get the txt with the book info
    public String getBooks(String genderBooks)
    {
        StringBuilder sb = new StringBuilder();

        try
            {
                BufferedReader reader = new BufferedReader(new FileReader(genderBooks));

                String ln = "";
                while( (ln = reader.readLine()) != null)
                {
                    sb.append(ln).append("\n \r");
                }
            }
            catch ( IOException i)
            {
                System.err.println(i);
            }

        return sb.toString();
    }
}
