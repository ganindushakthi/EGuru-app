package lk.eguru.repo;

import lk.eguru.entity.PaperEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Papers extends JpaRepository<PaperEntity,Integer> {
    List<Papers> findBySubjectAndGrade(String subject, String grade);
}
