package com.cw.dao;

import com.cw.domain.Subject;
import com.cw.domain.id.SubjectId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubjectRepository extends CrudRepository<Subject, SubjectId> {
    List<Subject> getAllByMetadata_ActivityStatus_Active(boolean isActive);
}
