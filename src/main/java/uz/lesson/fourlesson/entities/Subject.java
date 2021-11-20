package uz.lesson.fourlesson.entities;

import lombok.*;
import org.hibernate.Hibernate;
import uz.lesson.fourlesson.entities.base.BaseEntity;

import javax.persistence.Entity;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Subject extends BaseEntity {

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Subject subject = (Subject) o;
        return getId() != null && Objects.equals(getId(), subject.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
