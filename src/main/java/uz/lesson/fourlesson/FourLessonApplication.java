package uz.lesson.fourlesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.lesson.fourlesson.entities.BookEntity;
import uz.lesson.fourlesson.repositories.BookRepository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@SpringBootApplication
@RestController
public class FourLessonApplication {

    public final BookRepository bookRepository;

    public FourLessonApplication(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }

    @GetMapping("/")
    public ResponseEntity actionIndex(){
        Map<String,Object> map=new HashMap<>();
        map.put("message","Hello World!");
        map.put("status",200);
        map.put("time", new Date().getTime());
        return ResponseEntity.ok(map);
    }

    @GetMapping("/books")
    public ResponseEntity<Iterable<BookEntity>> getBooks(){
        return ResponseEntity.ok(bookRepository.findAll());
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id){
        Optional<BookEntity> bookEntity= bookRepository.findById(id);
        if(!bookEntity.isPresent()){
            return ResponseEntity.notFound().build();
        }
        bookRepository.delete(bookEntity.get());
        return ResponseEntity.ok(null);
    }

    @PostMapping("/book/insert")
    public ResponseEntity<BookEntity> insertBook(@RequestBody BookEntity bookEntity){
        bookRepository.save(bookEntity);
        return ResponseEntity.ok(bookEntity);
    }



    public static void main(String[] args) {
        SpringApplication.run(FourLessonApplication.class, args);
    }

}
