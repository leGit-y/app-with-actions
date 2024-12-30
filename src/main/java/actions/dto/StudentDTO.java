package actions.dto;

import actions.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class StudentDTO {

    private String name;

    public static StudentDTO from (Student student){
        return new StudentDTO(
                student.getName()
        );
    }

}
