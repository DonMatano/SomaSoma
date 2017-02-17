package com.matano.somasoma.Model;

/**
 * Created by matano on 17/2/17.
 */

public class Url
{
    private String urlAddress;
    private Topic topic;
    private int rating;

    public Url()
    {
    }

    public Url(String urlAddress, Topic topic)
    {
        this.urlAddress = urlAddress;
        this.topic = topic;
    }

    public Url(String urlAddress)
    {
        this.urlAddress = urlAddress;
    }

    public String getUrlAddress()
    {
        return urlAddress;
    }

    public void setUrlAddress(String urlAddress)
    {
        this.urlAddress = urlAddress;
    }

    public Topic getTopic()
    {
        return topic;
    }

    public void setTopic(Topic topic)
    {
        this.topic = topic;
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
