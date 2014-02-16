import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by John on 2/15/14.
 */
@Test
public class LabItineraryTest {
    public void findTravelRoute() {
        ArrayList<String> john = new ArrayList<String>();
        String r = LabItinerary.getTravelRoute(john);
        Assert.assertTrue(r.contains("travel route"));
    }

    public void checkCapital(){
        //check that the input is capitalized
        String s = LabItinerary.getCapital("Test");
        Assert.assertTrue(s.equals("TEST"));
    }

    public void toCheck(){
        // if multiple inputs, check that to was inserted between them.
        ArrayList<String> john = new ArrayList<String>();
        john.add("Salt Lake");
        john.add("Murray");
        String r = LabItinerary.getTravelRoute(john);
        Assert.assertTrue(r.contains("SALT LAKE to MURRAY"), "Expected [SALT LaKE to MURRAY] in [" + r + "]");

    }

    public void toEnd(){
        //verify that the string does not end in "to"
        ArrayList<String> john = new ArrayList<String>();
        john.add("Salt Lake");
        john.add("Murray");
        String r = LabItinerary.getTravelRoute(john);
        Assert.assertFalse(r.contains("Salt Lake to Murray to"));
    }
}
