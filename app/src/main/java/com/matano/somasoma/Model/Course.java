package com.matano.somasoma.Model;

import java.util.ArrayList;

/**
 * Created by matano on 17/2/17.
 */

public class Course
{
    private String courseName;
    private int rating;
    private ArrayList<Semester> semesterList;

    public Course(ArrayList<Semester> semesterList, String courseName)
    {
        this.semesterList = semesterList;
        this.courseName = courseName;
    }

    public Course()
    {
    }

    public Course(String courseName)
    {
        this.courseName = courseName;
    }



    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    public ArrayList<Semester> getSemesterList()
    {
        return semesterList;
    }

    public void setSemesterList(ArrayList<Semester> semesterList)
    {
        this.semesterList = semesterList;
    }
}


