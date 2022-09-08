/**
 * class: Movie
 * Date: September 8th 2022
 * Instruction of Program
 * 1. Attributes: Title, released year, name of the director, name of leading role
 * 2. constructors: no argument constructor which takes from the constructor with 4 parameters
 * 3. getters and setters
 * 4. toString method to display each info about a movie it will display each information line by line
 *
 */


public class Movie {

    private String title;
    private int year;
    private String nameD;
    private String nameL;


    public Movie(){
        this("10 Things I Hate About You",1999,"Gil Junger","Julia Stiles as Kat Stratford");

    }
    //Constructor
    public Movie(String title, int year, String director, String lRole)
    {
        this.title = title;
        this.year = year;
        this.nameD = director;
        this.nameL = lRole;
    }


    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNameD() {
        return nameD;
    }

    public void setNameD(String nameD) {
        this.nameD = nameD;
    }

    public String getNameL() {
        return nameL;
    }

    public void setNameL(String nameL) {
        this.nameL = nameL;
    }

   //String toString
    public String toString()
    {
        return "Title: " + title + "\n" + "Year: "  +  year + "\n" + "Name of Director: " + nameD + "\n" +
                "Name of Leading Role: " + nameL;
    }
}
