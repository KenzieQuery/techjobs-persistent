package org.launchcode.javawebdevtechjobspersistent.dataRepos;

import org.launchcode.javawebdevtechjobspersistent.models.Skill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Data Layer Part 2
//annotate with @Repository
@Repository
//should extend CrudRepository
public interface SkillRepository extends CrudRepository<Skill, Integer>{
}
