package io.agileintelligence.ppmtool.repositories;

import io.agileintelligence.ppmtool.domain.ProjectTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Date: 2022-04-05
 * Time: 9:26 PM
 */
@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {
}
