package com.adil.hotel.services;

import com.adil.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {
    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Hotel  get(String id);
}
