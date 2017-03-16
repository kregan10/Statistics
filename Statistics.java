package q1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p>This code takes user input from the command line, and returns the
 * average and standard deviation of the number set.</p>
 *
 * @author Kerry Regan
 * @version 1.0
 */
public class Statistics {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        /*Initializes arrayList from input from the user*/
        ArrayList<Integer> dataSet = new ArrayList<Integer>();
        final int MAX_ARRAY_SIZE = 50; 
        int count = 0;
        
        /*Setting up Scanner object to read from user*/

        Scanner scan;
        scan = new Scanner(System.in);
        
        /*Keeps reading until the input is 50 integers long
         * or, until the user doesnt enter anymore integers */

        while (count < MAX_ARRAY_SIZE) {
            String nextLine = scan.nextLine();
            if (nextLine.equals("")) {
               break;
            }
            Integer element = new Integer(nextLine);
            dataSet.add(element);
            count++;
        }
        scan.close();
        System.out.println(getMean(dataSet));
        System.out.println(getStanDev(dataSet));
     }
    
    /**
     * <p>Calculates mean from number set.</p>
     *
     * @param numSet
     * @return sum/numSet.size()
     */
    private static double getMean(ArrayList<Integer> numSet) {
        double sum = 0.0;
        
        for (int i = 0; i < numSet.size(); i++) {
            sum += numSet.get(i);
        }
        return sum / numSet.size();
    }
    
    /**
     * <p>Returns the standard deviation of the number set.</p>
     *
     * @param numSet
     * @return Math.sqrt(standardDev)
     */
    
    private static double getStanDev(ArrayList<Integer> numSet) {
        double standardDev = 0.0;
        double mean = getMean(numSet);
        
        for (int i = 0; i < numSet.size(); i++) {
            standardDev += Math.pow((numSet.get(i) - mean), 2)
                    / (numSet.size() - 1);
        }
        return Math.sqrt(standardDev);
    }

};
