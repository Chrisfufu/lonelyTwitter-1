package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by Ian on 22/03/2016.
 */
public class TweetList {
    ArrayList<AbstractTweet> tweets;

    public TweetList(){
        tweets = new ArrayList<AbstractTweet>();
    }

    public TweetList(ArrayList<AbstractTweet> t){
        tweets = t;
    }

    public ArrayList<AbstractTweet> getTweets() {
        return tweets;
    }

    public void add(AbstractTweet tweet){
        tweets.add(tweet);
    }

    public boolean hasTweet(AbstractTweet tweet){
        return tweets.contains(tweet);
    }

    public AbstractTweet getTweet(int index){
        return tweets.get(index);
    }

    public void delete(AbstractTweet tweet){
        tweets.remove(tweet);
    }

}