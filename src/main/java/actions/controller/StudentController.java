package actions.controller;

import actions.dto.StudentDTO;
import actions.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

//        System.out.println(studentNames);
        return students;
    }
}
