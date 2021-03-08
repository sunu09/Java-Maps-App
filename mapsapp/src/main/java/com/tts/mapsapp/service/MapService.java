package com.tts.mapsapp.service;

import com.tts.mapsapp.model.Location;
import org.springframework.beans.factory.annotation.Value;

public interface MapService {

    void addCoordinates(Location location);

}
