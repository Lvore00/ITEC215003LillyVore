/**
 * Name: Lillian Vore
 * class: MultiArrayDemo1
 * course: ITEC 2150 - 03 Fall 2022
 * version 1.0
 * date: August 25, 2022
 * description:  you will complete this program by calling two methods you
 * completed from the CodingBat in the main method.
 * Then, the output would like sum and average with two decimal points.
 *
 */
public class MultiArrayDemo1 {
    public static void main(String[] args) {

        MultiArrayDemo1 ob = new MultiArrayDemo1();
        int[][] miles = new int[7][7];
        miles = new int[][]
                {{0, 983, 787, 714, 1375, 967, 1087},
                        {983, 0, 214, 1102, 1763, 1723, 1842},
                        {787, 214, 0, 888, 1549, 1548, 1627},
                        {714, 1102, 888, 0, 661, 781, 810},
                        {1375, 1763, 1549, 661, 0, 1426, 1187},
                        {967, 1723, 1548, 781, 1426, 0, 239},
                        {1087, 1842, 1627, 810, 1187, 239, 0}};

            System.out.printf("Average: %f\n", ob.getAverageFrom2D(miles));
            System.out.printf("Sum: %d\n", ob.getSumFrom2D(miles));

    }

    public int getSumFrom2D(int[] ... matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    public double getAverageFrom2D( int[] ... matrix) {

        double sum = 0.0;
        int count = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                sum += matrix[i][j];
                count++;
            }
        }
        return sum / count;
    }

}
