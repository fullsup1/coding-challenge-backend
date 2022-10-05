package de.binarisinformatik.challenge.repositories.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "employmentMode is mandatory")
    private String employmentMode;

    @NotBlank(message = "capacity is mandatory")
    private String capacity;

    @NotBlank(message = "duration is mandatory")
    private String duration;

    @NotBlank(message = "startingYear is mandatory")
    private Long startingYear;

    @NotBlank(message = "role is mandatory")
    private String role;

    @NotBlank(message = "teamSize is mandatory")
    private Long teamSize;

    @NotBlank(message = "repo is mandatory")
    private String repo;

    @NotBlank(message = "liveUrl is mandatory")
    private String liveUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "applications_id")
    private Applications applications;

    public Applications getApplications() {
        return applications;
    }

    public void setApplications(Applications applications) {
        this.applications = applications;
    }


    public Projects() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmploymentMode() {
        return employmentMode;
    }

    public void setEmploymentMode(String employmentMode) {
        this.employmentMode = employmentMode;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Long getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(Long startingYear) {
        this.startingYear = startingYear;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(Long teamSize) {
        this.teamSize = teamSize;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public String getLiveUrl() {
        return liveUrl;
    }

    public void setLiveUrl(String liveUrl) {
        this.liveUrl = liveUrl;
    }


}
