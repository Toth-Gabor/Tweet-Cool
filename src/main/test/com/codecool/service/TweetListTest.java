package com.codecool.service;

import com.codecool.model.Tweet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class TweetListTest {
    
    private List<Tweet> tweeet = new ArrayList<>();
    private Tweet tweet1;
    private Tweet tweet2;
    //TODO teszteket megírni!
    @BeforeEach
    void setUp() {
        tweeet.add(tweet1 = new Tweet("joli", "Hali", new Date()));
        tweeet.add(tweet2 = new Tweet("jolika", "Halika", new Date()));
    }
    
    @Test
    void getTweetsByName() {
    }
    
    @Test
    void getNumberOfTweets() {
    }
    
    @Test
    void skipNumOfTweets() {
    }
    
    @Test
    void showTweetAfterThisDate() {
    }
}
