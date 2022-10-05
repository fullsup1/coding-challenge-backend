package de.binarisinformatik.challenge.repositories;

import de.binarisinformatik.challenge.repositories.entities.Applications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationsRepository extends JpaRepository<Applications, Long> {


}