package de.hsaalen.grademaster.hsaastudentservice.controller;

import de.hsaalen.grademaster.hsaastudentservice.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    // geneated list of students wit random id name and email

    private static final Map<String, Student> STUDENTS = Map.ofEntries(
            Map.entry("00001", new Student("00001", "John Doe", "john.doe@example.com")),
            Map.entry("00002", new Student("00002", "Jane Smith", "jane.smith@example.com")),
            Map.entry("00003", new Student("00003", "Alice Johnson", "alice.johnson@example.com")),
            Map.entry("00004", new Student("00004", "Michael Brown", "michael.brown@example.com")),
            Map.entry("00005", new Student("00005", "Emily Davis", "emily.davis@example.com")),
            Map.entry("00006", new Student("00006", "Chris Wilson", "chris.wilson@example.com")),
            Map.entry("00007", new Student("00007", "Jessica Miller", "jessica.miller@example.com")),
            Map.entry("00008", new Student("00008", "Daniel Martinez", "daniel.martinez@example.com")),
            Map.entry("00009", new Student("00009", "Laura Garcia", "laura.garcia@example.com"))
    );

    @GetMapping
    public List<Student> getCountries(){
        return STUDENTS.values().stream().toList();
    }

    @GetMapping("/{matriculationNumber}")
    public Student getStudent(@PathVariable String matriculationNumber){
        return STUDENTS.get(matriculationNumber);
    }
}
