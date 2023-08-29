package com.example.in.repositories;

import com.example.in.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CountryRepository extends JpaRepository<Country,String> {
    Optional<Country> findByCountryId(String countryId);
}
