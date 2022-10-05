package de.binarisinformatik.challenge.controller;

import de.binarisinformatik.challenge.repositories.entities.Applications;
import de.binarisinformatik.challenge.services.ApplicationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ApplicationsController {

    @Autowired
    private final ApplicationsService applicationsService;


    public ApplicationsController(final ApplicationsService applicationsService) {
        this.applicationsService = applicationsService;
    }

    @GetMapping(value = "/Applications/{id}")
    public @ResponseBody Optional<Applications> returnApplication(@PathVariable("id") final Long id) {
        return applicationsService.findById(id);
    }

//    @GetMapping(value = "/Applications")
//    public ResponseEntity<List<Applications>> returnAllApplications(@RequestParam(defaultValue = "0") final Integer pageNumber,
//                                                         @RequestParam(defaultValue = "4") final Integer pageSize,
//                                                         @RequestParam(defaultValue = "id") final String sortBy) {
//        List<Applications> allApplications = applicationsService.getAllApplications(pageNumber, pageSize, sortBy);
//
//        return new ResponseEntity<>(allApplications, new HttpHeaders(), HttpStatus.OK);
//    }
    @GetMapping(value = "/Applications")
    public List<Applications> returnAllApplications() {
        System.out.println(applicationsService.findAll());
        return applicationsService.findAll();
    }

}
