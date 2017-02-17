package com.matano.somasoma.Model;

import java.util.ArrayList;

/**
 * Created by matano on 17/2/17.
 */

public class Unit
{
    private String unitName;
    private int rating;
    private ArrayList<Topic> topicList;

    public Unit()
    {
    }

    public Unit(String unitName)
    {
        this.unitName = unitName;
    }

    public Unit(String unitName, ArrayList<Topic> topicList)
    {
        this.unitName = unitName;
        this.topicList = topicList;
    }

    public String getUnitName()
    {
        return unitName;
    }

    public void setUnitName(String unitName)
    {
        this.unitName = unitName;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    public ArrayList<Topic> getTopicList()
    {
        return topicList;
    }

    public void setTopicList(ArrayList<Topic> topicList)
    {
        this.topicList = topicList;
    }
}
