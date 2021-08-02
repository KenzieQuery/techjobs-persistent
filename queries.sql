## Part 1: Test it with SQL
// list the columns and their data types in the table.
Columns:ID, Employer, Name, Skills
Data Types: Integer, String, String, String

## Part 2: Test it with SQL
// write a query to list the names of the employers in St. Louis City.
SELECT name
FROM employer
WHERE employer.location="St.Lous City";

## Part 3: Test it with SQL
// write the SQL statement to remove the job table.
DROP TABLE job;

## Part 4: Test it with SQL
// write a query to return a list of the names and descriptions of all skills that are attached to jobs in
// alphabetical order. If a skill does not have a job listed, it should not be included in the results of this query.
// You will need to make use of “is not null”.
SELECT skill.name, skill.description
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
ORDER BY name ASC;
