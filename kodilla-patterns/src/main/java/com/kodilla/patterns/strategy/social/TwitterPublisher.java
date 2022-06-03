package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Twitter User";
    }
}
