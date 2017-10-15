
import Strategy.Interfaces.RecomenderOfBooks;
import Strategy.configStrategy.ConfigStrategy;
import java.util.Scanner;

public class Main
{
    public Main () {}

    public static void main(String[] args)
    {
        //
        System.out.println("Book recomendation system choose a gender");
        //showing the genders
        System.out.println("Comedy, Actions, Novels, Drama, Poetry, Self-Improvement, Terror, IT");
        //alerting the users (if isn't like above doesn't work )
        System.out.println("Write as written above");

        //creating the scanner
        Scanner sc = new Scanner(System.in);

        //getting the gender of the books
        String genderBooks = sc.nextLine();

        //Instantiating the strategy
        ConfigStrategy configStrategy = ConfigStrategy.getInstance();
        RecomenderOfBooks recomender = null;

        try {
            recomender = (RecomenderOfBooks) Class.forName(configStrategy.getProperties(genderBooks)).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //printing the books
        System.out.println("Books:  \n"  + recomender.recomend());

    }
}
