package com.bridgelabz;

import org.junit.Test;

import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    @Test
    public void givenHotelNameAndRatesShouldReturnTrue() {
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.add("BridgeWood",160,60);
        hotelReservation.add("LikeWood",110,90);
        hotelReservation.add("RidgeWood",220,150);

    }
}