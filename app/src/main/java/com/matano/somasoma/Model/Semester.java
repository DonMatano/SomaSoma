package com.matano.somasoma.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matano on 17/2/17.
 */

public class Semester
{
    private String semesterName;
    private int rating;
    private ArrayList<Subject> subjectList;

    public Semester()
    {
    }

    public Semester(String semesterName, ArrayList<Subject> subjectList)
    {
        this.semesterName = semesterName;
        this.subjectList = subjectList;
    }

    public Semester(String semesterName)
    {
        this.semesterName = semesterName;
    }



    public String getSemesterName()
    {
        return semesterName;
    }

    public void setSemesterName(String semesterName)
    {
        this.semesterName = semesterName;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    public ArrayList<Subject> getSubjectList()
    {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList)
    {
        this.subjectList = subjectList;
    }
}
