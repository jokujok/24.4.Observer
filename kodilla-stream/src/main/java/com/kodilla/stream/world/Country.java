package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    public final String countryName;
    public final int countryPeopleQuantity;

    public Country(final String countryName, final int countryPeopleQuantity) {
        this.countryName = countryName;
        this.countryPeopleQuantity = countryPeopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCountryPeopleQuantity() {
        return countryPeopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = new BigDecimal("8000000000");
        return  peopleQuantity;
    }

}
