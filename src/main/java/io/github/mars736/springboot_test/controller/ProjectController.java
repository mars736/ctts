package io.github.mars736.springboot_test.controller;

import io.github.mars736.springboot_test.entity.Student;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Tag(name ="ProjectController", description = "Project Controller")
public class ProjectController {
    private final List<Student> students=new ArrayList<>();
    public ProjectController() {
        students.add(new Student(1,"John",20,"111"));
        students.add(new Student(2,"Jane",21,"222"));
        students.add(new Student(3,"Bob",22,"333"));
        students.add(new Student(4,"Alice",23,"444"));
    }

    @GetMapping("/students")
    @Operation(summary = "Get all students", description = "返回所有学生信息")
    public List<Student> getStudents() {
        return students;
}



    @GetMapping("/students/{id}")
    @Operation(summary = "Get student by ID", description = "返回指定ID的学生信息")
    @Parameter(name = "id", description = "学生ID")
    public Student getStudentById(@PathVariable int id) {
        return students.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
    }



    @GetMapping("/students/page")
    @Operation(summary = "Get students by page", description = "返回指定页码和页面大小的学生列表")
    @Parameter(name = "page", description = "页码数")
    @Parameter(name = "size", description = "页面大小")
    public List<Student> getStudentByPage(@RequestParam int page, @RequestParam int size) {
        int start = (page - 1) * size;
        int end = Math.min(start + size, students.size());
        if (start >= students.size()) {
            return new ArrayList<>();
        }
        return students.subList(start, end);
    }
}



