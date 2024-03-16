package com.sampleManagement.StudentManagementSys.Controller;


import com.sampleManagement.StudentManagementSys.Entity.Mark;
import com.sampleManagement.StudentManagementSys.Entity.Student;
import com.sampleManagement.StudentManagementSys.Service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mark")
public class MarkController {


    @Autowired
    private MarkService marksService;

    @GetMapping("/student/{rollNo}")
    public ResponseEntity<List<Mark>> getMarksByStudent(@PathVariable Integer rollNo) {
        Student student = new Student();
        student.setRollNo(rollNo);
        List<Mark> mark = marksService.getMarksByStudent(student);
        return ResponseEntity.ok(mark);
    }

    @PostMapping
    public ResponseEntity<Mark> addMarks(@RequestBody Mark mark) {
        Mark addedMarks = marksService.addMarks(mark);
        return ResponseEntity.ok(addedMarks);
    }

}
