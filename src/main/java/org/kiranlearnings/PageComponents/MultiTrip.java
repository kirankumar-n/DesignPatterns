package org.kiranlearnings.PageComponents;

import org.kiranlearnings.AbstractComponent.SearchFlight;

public class MultiTrip implements SearchFlight {
    @Override
    public void checkFlightAvailability(String origin, String destination) {
        System.out.println("Inside MultiTrip");
    }
}
