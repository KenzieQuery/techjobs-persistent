package org.launchcode.javawebdevtechjobspersistent.dataRepos;

import org.launchcode.javawebdevtechjobspersistent.models.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Data Layer Part 1
//annotate with @Repository
@Repository
//extend CrudRepository
public interface EmployerRepository extends CrudRepository<Employer, Integer> {
}
