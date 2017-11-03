package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by watts1 on 1/28/16.
 */
public class AbstractTweetListTest extends ActivityInstrumentationTestCase2 {
    public AbstractTweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        AbstractTweet tweet = new NormalAbstractTweet("Test AbstractTweet");

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        AbstractTweet tweet = new NormalAbstractTweet("Another Test AbstractTweet");

        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        AbstractTweet tweet = new NormalAbstractTweet("Another Test AbstractTweet");

        tweets.add(tweet);
        AbstractTweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        AbstractTweet tweet = new NormalAbstractTweet("Another Test AbstractTweet");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }


}