package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by makepeac on 9/29/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
       // assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding Tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

    }

    public void testDelete() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void TweetGetTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        Tweet returnedTweet = list.getTweet(0);
        assertEquals(returnedTweet.getMessage(),tweet.getMessage());
    }

    public void testGetCount() {
        TweetList list =  new TweetList();
        Tweet tweet = new NormalTweet("test");
        Tweet tweet2 = new NormalTweet("test2");
        list.add(tweet);
        list.add(tweet2);
        int getCount = list.getCount();
        assertEquals(getCount,2);
    }

    public void testGetTweets() {
        TweetList list =  new TweetList();
        Tweet tweet = new NormalTweet("banana");
        Tweet tweet2 = new NormalTweet("apple");
        list.add(tweet);
        list.add(tweet2);

        ArrayList<Tweet> rightAnswer = new ArrayList<Tweet>();

        rightAnswer.add(new NormalTweet("banana"));
        rightAnswer.add(new NormalTweet("apple"));
        assertEquals(list.getTweets(),rightAnswer);

    }
}
