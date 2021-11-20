package uz.lesson.fourlesson.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.lesson.fourlesson.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
