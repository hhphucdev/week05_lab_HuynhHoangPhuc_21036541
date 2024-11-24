package iuh.week05_lab_huynhhoangphuc_21036541.backend.repositories;

import iuh.week05_lab_huynhhoangphuc_21036541.backend.models.JobSkill;
import iuh.week05_lab_huynhhoangphuc_21036541.backend.models.Skill;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface JobSkillRepository extends JpaRepository<JobSkill, Skill> {
    @Query("SELECT js.skill.id FROM JobSkill js WHERE js.job.id = :jobId")
    List<Long> findSkillIdsByJobId(@Param("jobId") Long jobId);

    @Modifying
    @Transactional
    @Query("DELETE FROM JobSkill js WHERE js.job.id = :jobId")
    void deleteByJobId(@Param("jobId") Long jobId);
}
