package iuh.week05_lab_huynhhoangphuc_21036541.backend.repositories;

import iuh.week05_lab_huynhhoangphuc_21036541.backend.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skill, Long> {

    @Query("SELECT s FROM Skill s JOIN JobSkill js ON s.id = js.skill.id WHERE js.job.id = :jobId")
    List<Skill> findSkillsByJobId(@Param("jobId") Long jobId);
}