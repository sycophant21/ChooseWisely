package com.cw.handler;

import com.cw.dao.SubjectRepository;
import com.cw.domain.Subject;
import com.cw.domain.id.SubjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SubjectHandler {
    private final SubjectRepository subjectRepository;
    private final Logger logger;

    public SubjectHandler(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
        this.logger = LoggerFactory.getLogger(this.getClass());
    }

    public Subject getSubjectDetails(String subjectId) {
        return subjectRepository.findById(new SubjectId(subjectId)).orElse(new Subject());
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.getAllByMetadata_ActivityStatus_Active(true);
    }
}
