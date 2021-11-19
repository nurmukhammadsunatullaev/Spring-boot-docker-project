package uz.lesson.fourlesson.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.lesson.fourlesson.entities.BookEntity;

import java.util.Optional;


@Repository
public interface BookRepository extends JpaRepository<BookEntity,Long> {
   Optional<BookEntity> findById(Long id);
}
