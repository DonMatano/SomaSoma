package com.matano.somasoma;

import android.util.Log;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.matano.somasoma.Model.FirebaseConnector;
import com.matano.somasoma.Model.Semester;
import com.matano.somasoma.Model.Subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by matano on 25/11/16.
 */

public class TrialList
{
    final static String TAG = TrialList.class.getSimpleName();

    //Method that returns a HashMap of the data to be displayed on the expandable
    //list.
    public static HashMap<String, List<String>> getData(FirebaseConnector connector)
    {

        HashMap<String, List<String>> expandableListDetail =
                new HashMap<String, List<String>>();

        ArrayList<String> semester5 = new ArrayList<String>();
        semester5 = addSubjects(connector);

        //semester5.add("Java");
        //semester5.add("Computer Networking");
        //semester5.add("Numerical Methods");


        //return expandableListDetail;




        //Puts the semester list to the expandable list.
        expandableListDetail.put("Semester 5", semester5);

        return expandableListDetail;

    }

    private static ArrayList<String> addSubjects(FirebaseConnector connector)
    {
       final ArrayList<String> list = new ArrayList<>();
        DatabaseReference subjectReference = connector.getDatabaseReference().child("subject");
        Log.d(TAG , "subjectReference made = " + subjectReference.getKey());

        subjectReference.addListenerForSingleValueEvent(new ValueEventListener()
        {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {


                Log.d(TAG, "Count = " + dataSnapshot.getChildrenCount());

                for (DataSnapshot snapshot: dataSnapshot.getChildren())
                {
                    Subject subject = snapshot.getValue(Subject.class);
                    Log.d("Get Data" , subject.getSubjectName());
                    list.add(subject.getSubjectName());
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError)
            {
                Log.e("The read failed: " , databaseError.getMessage());
            }
        });

        return list;
    }

}
