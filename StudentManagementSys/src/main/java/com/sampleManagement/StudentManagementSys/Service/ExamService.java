package com.sampleManagement.StudentManagementSys.Service;

import com.sampleManagement.StudentManagementSys.Entity.Exam;

import com.sampleManagement.StudentManagementSys.Repository.ExamRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamService {
    @Autowired
    private ExamRepository examRepository;

    public Exam createExam(Exam exam) {
        return examRepository.save(exam);
    }

}
