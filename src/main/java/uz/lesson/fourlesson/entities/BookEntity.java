package uz.lesson.fourlesson.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="tb_book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String bookName;
    private String bookAuthor;
}
