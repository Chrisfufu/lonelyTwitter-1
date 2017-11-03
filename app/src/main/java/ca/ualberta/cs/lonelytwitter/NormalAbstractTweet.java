package ca.ualberta.cs.lonelytwitter;

/**
 * Created by chris on 2017-11-03.
 */

import java.util.Date;

public class NormalAbstractTweet extends AbstractTweet implements Tweetable {
    public NormalAbstractTweet(Date date, String message) {
        super(date, message);
    }

    public NormalAbstractTweet(String message) {
        super(message);
    }

    public Date getDate() {
        return this.date;
    }

    public String getMessage() {
        return this.message;
    }

    //@Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
