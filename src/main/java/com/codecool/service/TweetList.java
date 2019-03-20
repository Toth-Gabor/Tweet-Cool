package com.codecool.service;

import com.codecool.model.Tweet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TweetList {
    private static TweetList ourInstance = new TweetList();
    private List<Tweet> tweets;
    
    public static TweetList getInstance() {
        return ourInstance;
    }
    
    private TweetList() {
        tweets = new ArrayList<>();
    }
    
    public List<Tweet> getTweets() {
        return tweets;
    }
    
    public void addTweet(Tweet tweet) {
        tweets.add(tweet);
    }
    
    public List<Tweet> getTweetsByName(String name) { // throws exeptions????
        List<Tweet> tweetsByName = new ArrayList<>();
        
        for (Tweet tweet : tweets) {
            if (tweet.getName().equals(name)) {
                tweetsByName.add(tweet);
            }
        }
        return tweetsByName.size() != 0 ? tweetsByName : tweets;
    }
    
    public List<Tweet> getNumberOfTweets(int num) { // throws exeptions????
        List<Tweet> amountOfTweets = new ArrayList<>();

        if (num >= tweets.size()) {
            return tweets;
        }
        if (num < tweets.size()) {
            for (int i = 0; i < num; i++) {
                amountOfTweets.add(tweets.get(i));
            }
        }
        return amountOfTweets;
    }
    
    public List<Tweet> skipNumOfTweets(int num) { // throws exeptions????
        List<Tweet> notSkippedTweets = new ArrayList<>();
        if (num >= tweets.size()) {
            return tweets;
        } else {
            for (int i = num - 1; i < tweets.size(); i++) {
                notSkippedTweets.add(tweets.get(i));
            }
        }
        return notSkippedTweets;
    }
    
    public List<Tweet> showTweetAfterThisDate(Date date) {
        List<Tweet> filteredByDate = new ArrayList<>();
        for (Tweet tweet : tweets) {
            if (tweet.getDate().compareTo(date) >= 0) {
                filteredByDate.add(tweet);
            }
        }
        return filteredByDate;
        
    }
}
