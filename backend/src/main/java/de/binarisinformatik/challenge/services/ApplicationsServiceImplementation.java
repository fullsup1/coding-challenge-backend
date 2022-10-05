package de.binarisinformatik.challenge.services;

import de.binarisinformatik.challenge.repositories.ApplicationsRepository;
import de.binarisinformatik.challenge.repositories.entities.Applications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ApplicationsServiceImplementation implements ApplicationsService {
    private final ApplicationsRepository applicationsRepository;

    @Autowired
    public ApplicationsServiceImplementation(final ApplicationsRepository applicationsRepository) {
        this.applicationsRepository = applicationsRepository;
    }

    @Override
    public Optional<Applications> findById(final Long id) {
        return applicationsRepository.findById(id);
    }

    @Override
    public Applications save(final Applications applications) {
        return applicationsRepository.save(applications);
    }

    @Override
    public List<Applications> findAll() {
        return applicationsRepository.findAll();
    }

    /**
     * Function for displaying fewer applications on requests to reduce server load.
     *
     * @param pageNumber The page of applications to be shown on the client. Default is 0.
     * @param pageSize The amount of applications to be converted into a single page. Default is 3.
     * @param sortBy The identifier to sort the applications. Default is by ID.
     * @return The defined page.
     */
    @Override
    public List<Applications> getAllApplications(final Integer pageNumber, final Integer pageSize, final String sortBy) {

        Pageable page = PageRequest.of(pageNumber, pageSize, Sort.by(sortBy).ascending());
        var pagedResult = applicationsRepository.findAll(page);

        if (pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<>();
        }
    }
}
