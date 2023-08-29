package com.example.in.services;

import java.math.BigDecimal;
import java.util.List;
import com.example.in.entities.Location;

public interface LocationService {
    void addLocation(Location location);
    void updateLocation(Location location);
    List<Location> getAllLocations();
    Location getLocationById(BigDecimal locationId);
    String deleteByLocationId(BigDecimal locationId);
}
