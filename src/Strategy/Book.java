package Strategy;

//testing the program (no necesary)
public class Book
{
    private String title;
    private String autor;
    private String gender;
    //    private String dateOut;

    public Book(String title, String autor, String gender)
    {
        super();

        this.title = title;
        this.autor = autor;
        this.gender = gender;
    }

    public String getTitle() { return title; }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

//    public String getDateOut()
//    {
//        return dateOut;
//    }
//
//    public void setDateOut(String dateOut)
//    {
//        this.dateOut = dateOut;
//    }


    @Override
    public String toString() {
        return title;
    }


}
