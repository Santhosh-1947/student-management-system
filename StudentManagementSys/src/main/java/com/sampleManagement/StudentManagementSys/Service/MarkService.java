package com.sampleManagement.StudentManagementSys.Service;


import com.sampleManagement.StudentManagementSys.Entity.Mark;
import com.sampleManagement.StudentManagementSys.Entity.Student;
import com.sampleManagement.StudentManagementSys.Repository.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkService {

    @Autowired
    private MarkRepository markRepository;

    public List<Mark> getMarksByStudent(Student student) {
        return markRepository.findByStudent(student);
    }

    public Mark addMarks(Mark mark) {
        mark.setTotalMark(mark.getTamil() + mark.getEnglish() + mark.getMaths() + mark.getScience() + mark.getSocialScience());
        mark.setAverageMark(mark.getTotalMark() / 5.0);
        return markRepository.save(mark);
    }




}
