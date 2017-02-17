package com.matano.somasoma.Model;

import java.util.ArrayList;

/**
 * Created by matano on 17/2/17.
 */

public class University
{
    private String universityName;
    private ArrayList<Course> courseList;
    private int rating;

    public University()
    {
    }

    public University(String universityName)
    {
        this.universityName = universityName;
    }

    public University(String universityName, ArrayList<Course> courseList)
    {
        this.universityName = universityName;
        this.courseList = courseList;
    }

    public String getUniversityName()
    {
        return universityName;
    }

    public void setUniversityName(String universityName)
    {
        this.universityName = universityName;
    }

    public ArrayList<Course> getCourseList()
    {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList)
    {
        this.courseList = courseList;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }
}
