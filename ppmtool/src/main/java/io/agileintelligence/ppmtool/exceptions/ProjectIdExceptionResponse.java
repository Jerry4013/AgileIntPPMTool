package io.agileintelligence.ppmtool.exceptions;

/**
 * Date: 2022-04-01
 * Time: 11:16 PM
 */
public class ProjectIdExceptionResponse {

    private String projectIdentifier;

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public ProjectIdExceptionResponse(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }
}
