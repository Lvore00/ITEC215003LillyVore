/**
 * class:  PrimitiveParameters
 * course: Intermediate Programming Sec 03
 * name: Lillian Vore
 * date: 8/23/2022
 * version: 1.2
 * description: Practice Dice Roll Correction
 */

public class Roll {

    public static void main(String[] args) {
        Roll mobj = new Roll();
        System.out.println(mobj.roll(1,6)); //this should return numbers between 1
        // and 6 . 1 and 6 are inclusive (1,2,3,4,5,6)
    }
      
      public  int roll(int min, int max) {
        int range = max - min;
        return (int)((Math.random() * range)) + min + 1; // adding 1 or min to max
    }
      
      

}
