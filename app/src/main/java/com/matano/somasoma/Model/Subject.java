package com.matano.somasoma.Model;

import java.util.ArrayList;
/**
 * Created by matano on 17/2/17.
 */

public class Subject
{
    private String subjectName;
    private int rating;
    private ArrayList<Unit> unitList;

    public Subject()
    {
    }

    public Subject(String subjectName, ArrayList<Unit> unitList)
    {
        this.subjectName = subjectName;
        this.unitList = unitList;
    }

    public Subject(String subjectName)
    {
        this.subjectName = subjectName;
    }

    public String getSubjectName()
    {
        return subjectName;
    }

    public void setSubjectName(String subjectName)
    {
        this.subjectName = subjectName;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    public ArrayList<Unit> getUnitList()
    {
        return unitList;
    }

    public void setUnitList(ArrayList<Unit> unitList)
    {
        this.unitList = unitList;
    }
}
