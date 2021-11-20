package uz.lesson.fourlesson.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.lesson.fourlesson.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
