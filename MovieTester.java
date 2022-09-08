/**
 * this program will include at least three movie objects based on each constructor you will create
 * Test getters and test setters
 * display all info of three movies nicely
 */


public class MovieTester {
    public static void main(String[] args)
    {
       //Movie Number 1:
        Movie thingsIHate = new Movie();


        //Movie Number 2:
        Movie anotherMovie = new Movie("Iron Man" ,2008,"Jon Favreau",
                "Robert Downey Jr. as Tony Stark");

       //Movie Number 3:
        Movie another = new Movie("Steel Magnolias", 1989, "Herbert Ross", "Sally Field as M'Lynn Eatenton");

        System.out.println(thingsIHate);
        System.out.println(anotherMovie);
        System.out.println(another);

    }
}
