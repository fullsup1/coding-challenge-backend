package de.binarisinformatik.challenge.services;

import de.binarisinformatik.challenge.repositories.entities.Applications;

import java.util.List;
import java.util.Optional;

public interface ApplicationsService {
    Optional<Applications> findById(Long id);

    Applications save(Applications applications);

    List<Applications> findAll();

    List<Applications> getAllApplications(Integer pageNumber, Integer pageSize, String sortBy);
}
