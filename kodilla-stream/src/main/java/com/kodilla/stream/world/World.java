package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
        continents.add(continent);
        continents.add(continent);
        continents.add(continent);
        continents.add(continent);
    }
    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = new BigDecimal("8000000000");
                return peopleQuantity;
    }
}
