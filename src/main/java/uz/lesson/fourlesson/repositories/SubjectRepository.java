package uz.lesson.fourlesson.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.lesson.fourlesson.entities.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
