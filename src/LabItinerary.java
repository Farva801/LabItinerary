

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: moss
 * Date: 2/6/14
 * Time: 3:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class LabItinerary {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> itinerary = processInput();
        System.out.println(getTravelRoute(itinerary));
    }

    public static String getCapital(String word) {
        return word.toUpperCase();
    }

    public static ArrayList<String> processInput() {
        ArrayList<String> itinerary = new ArrayList<String>();
        String dest;

        while (true) {
            System.out.print("Destination: ");
            dest = input.nextLine();

            if (!dest.toLowerCase().equals("done")) {
                dest = dest.substring(0, 1).toUpperCase() + dest.substring(1);
            } else break;

            itinerary.add(dest); //not sure how to increment the index with each input.
        }
        return itinerary;
    }

    public static String getTravelRoute(ArrayList<String> items) {
        StringBuilder sb = new StringBuilder();
        sb.append("\ntravel route:\n");

        for (int i=0; i<items.size(); i++) {
            sb.append(getCapital(items.get(i)));
            if (i < items.size() - 1 ) {
                sb.append(" to ");
            }
        }

        return sb.toString();
    }


}
