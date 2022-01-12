package org.kiranlearnings.PageComponents;

import org.kiranlearnings.AbstractComponent.SearchFlight;

public class RoundTrip implements SearchFlight {
    @Override
    public void checkFlightAvailability(String origin, String destination) {
        System.out.println("Inside RoundTrip");
    }
}
