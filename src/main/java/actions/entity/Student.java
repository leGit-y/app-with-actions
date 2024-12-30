package actions.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@Entity
public class Student {
    @Id
    private int id;

    private String name;

    protected Student(){}

    private Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


}
