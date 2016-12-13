package com.matano.somasoma;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by matano on 25/11/16.
 */

public class TrialList
{
    public static HashMap<String, List<String>> getData()
    {
        HashMap<String, List<String>> expandableListDetail =
                new HashMap<String, List<String>>();

        List<String> semester5 = new ArrayList<String>();
        //semester5.add("Java");
        //semester5.add("Computer Networking");
        semester5.add("Database Management");
        //semester5.add("Numerical Methods");

        expandableListDetail.put("Semester 5", semester5);
        return expandableListDetail;
    }

}
