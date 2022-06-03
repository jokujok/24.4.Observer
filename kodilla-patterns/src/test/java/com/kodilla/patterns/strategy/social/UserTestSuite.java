package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User adam = new Millenials("Adam");
        User bartek = new YGeneration("Bartek");
        User janek = new ZGeneration("Janek");

        //When
        String adamPrefer = adam.sharePost();
        System.out.println("Adam Prefer" + adamPrefer);
        String bartekPrefer = bartek.sharePost();
        System.out.println("Bartek Prefer" + bartekPrefer);
        String janekPrefer = janek.sharePost();
        System.out.println("Janek Prefer" + janekPrefer);

        //Then
        assertEquals("Facebook User", adamPrefer);
        assertEquals("Twitter User", bartekPrefer);
        assertEquals("Snapchat User", janekPrefer);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User adam = new Millenials("Adam");

        //When
        String adamPrefer = adam.sharePost();
        System.out.println("Adam Prefer" + adamPrefer);
        adam.setSocialPublisher(new TwitterPublisher());
        adamPrefer = adam.sharePost();
        System.out.println("Adam now prefer" + adamPrefer);

        //Then
        assertEquals("Twitter User", adamPrefer);
    }
}
