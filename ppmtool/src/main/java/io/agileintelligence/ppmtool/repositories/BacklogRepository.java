package io.agileintelligence.ppmtool.repositories;

import io.agileintelligence.ppmtool.domain.Backlog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Date: 2022-04-05
 * Time: 9:25 PM
 */
@Repository
public interface BacklogRepository extends CrudRepository<Backlog, Long> {

}
