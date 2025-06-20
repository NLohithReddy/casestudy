package com.hexaware.simplyfly.service;

import com.hexaware.simplyfly.entity.Flight;
import com.hexaware.simplyfly.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * FlightService handles the business logic for managing flights.
 * It provides methods to add, retrieve, delete, and search for flights.
 * 
 * Developer: N Lohith Reddy
 * Created on: May 27, 2025
 */
@Service
public class FlightService {

private final FlightRepository flightRepository;

public FlightService(FlightRepository flightRepository) {
    this.flightRepository = flightRepository;
}

public Flight addFlight(Flight flight) {
    return flightRepository.save(flight);
}

public List<Flight> getAllFlights() {
    return flightRepository.findAll();
}

public Optional<Flight> getFlightById(Long id) {
    return flightRepository.findById(id);
}

public void deleteFlight(Long id) {
    flightRepository.deleteById(id);
}

public List<Flight> searchFlights(String source, String destination) {
    return flightRepository.findBySourceAndDestination(source, destination);
}
}