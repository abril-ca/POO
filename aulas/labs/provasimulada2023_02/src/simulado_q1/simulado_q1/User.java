package simulado_q1;

import java.util.*;

public class User
{
    private String twitterId;
    private LinkedList<Tweet> tweets = new LinkedList<>();

    public User(String twitterId)
    {
        this.twitterId = twitterId;
    }

    public String getTwitterId()
    {
        return this.twitterId;
    }

    public void addTweet(Tweet tweet) {
        this.tweets.add(tweet);
    }

    public LinkedList<Tweet> getTweets()
    {
        return new LinkedList<>(this.tweets);
    }
}

