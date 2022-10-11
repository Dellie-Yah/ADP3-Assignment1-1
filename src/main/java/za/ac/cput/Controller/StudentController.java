package za.ac.cput.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.Domain.Entity.Student;
import za.ac.cput.Service.Impl.StudentService;
import za.ac.cput.Service.Impl.StudentServiceImpl;

import java.util.List;

/**
 *
 * Keziah Robinson
 * 219113149
 * Student Controller
 *
 */


@RestController
//@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;
    private final static Logger log = LoggerFactory.getLogger(StudentController.class);

//    @Autowired
//    public StudentController(StudentServiceImpl studentService){
//        this.studentService = studentService;
//    }

    @PostMapping("/student")
    public Student save(@RequestBody Student student) {
        Student students = studentService.save(student);
        return students;
    }

    @GetMapping("/student/{studentID}")
    public Student read(@PathVariable String studentID){
        Student students  = studentService.read(studentID).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return students;
    }

    @DeleteMapping("/student")
    public void delete(Student student){
        log.info("Delete student: {}", student);
        this.delete(student);
    }

    @PutMapping("/student")
    public Student update(Student student){
        Student students = studentService.update(student);
        return students;
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> readAll(){
        List<Student>students = this.studentService.readAll();
        return ResponseEntity.ok(students);
    }
}
