package fr.ippon.tatami.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * A user.
 *
 * @author Julien Dubois
 */
@Entity
@Table(name = "Tweet")
public class Tweet {

    @Id
    private String tweetId;

    @Column(name = "login")
    private String login;

    @Column(name = "content")
    private String content;

    @Column(name = "tweetDate")
    private Date tweetDate;

    public String getTweetId() {
        return tweetId;
    }

    public void setTweetId(String tweetId) {
        this.tweetId = tweetId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tweet tweet = (Tweet) o;

        if (tweetId != null ? !tweetId.equals(tweet.tweetId) : tweet.tweetId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return tweetId != null ? tweetId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "tweetId='" + tweetId + '\'' +
                ", login='" + login + '\'' +
                ", content='" + content + '\'' +
                ", tweetDate=" + tweetDate +
                '}';
    }
}
