package com.matano.somasoma.Model;

import java.util.ArrayList;

/**
 * Created by matano on 17/2/17.
 */

public class Topic
{
    private String topicName;
    private int rating;
    private ArrayList<Url> urlList;
    private ArrayList<Unit> unitList;

    public Topic()
    {
    }

    public Topic(String topicName)
    {
        this.topicName = topicName;
    }

    public Topic(String topicName, ArrayList<Url> urlList, ArrayList<Unit> unitList)
    {
        this.topicName = topicName;
        this.urlList = urlList;
        this.unitList = unitList;
    }

    public Topic(ArrayList<Unit> unitList, String topicName)
    {

        this.unitList = unitList;
        this.topicName = topicName;
    }

    public String getTopicName()
    {
        return topicName;
    }

    public void setTopicName(String topicName)
    {
        this.topicName = topicName;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    public ArrayList<Url> getUrlList()
    {
        return urlList;
    }

    public void setUrlList(ArrayList<Url> urlList)
    {
        this.urlList = urlList;
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
