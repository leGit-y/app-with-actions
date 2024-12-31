package actions.controller;

import actions.dto.StudentDTO;
import actions.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/students")
@RestController
public class StudentController {
    private final StudentService studentService;

    @ResponseBody
    @GetMapping
    public List<StudentDTO> getStudents(){

        List<StudentDTO> students = studentService.getStudents();

        return students;
    }

    @ResponseBody
    @PostMapping
    public StudentDTO postStudent(@RequestBody StudentDTO studentDTO){

        System.out.println(studentDTO);
        StudentDTO student = studentService.postStudent(studentDTO);

        return student;
    }
}
