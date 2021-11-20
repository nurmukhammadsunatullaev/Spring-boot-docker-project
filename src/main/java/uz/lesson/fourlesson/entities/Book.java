package uz.lesson.fourlesson.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;
import uz.lesson.fourlesson.entities.base.BaseEntity;

import javax.persistence.Entity;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Book extends BaseEntity {
    private String name;
    private String author;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Book that = (Book) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
