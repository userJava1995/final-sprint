package kz.bitlab.academy.finalsprint.commentaries.service;

import kz.bitlab.academy.finalsprint.commentaries.entity.CommentEntity;
import kz.bitlab.academy.finalsprint.tasks.entity.TaskEntity;

import java.util.List;

public interface CommentService {

    void create(Long taskId, String commentTask);

    List<CommentEntity> findAllByTask(Long taskId);

    CommentEntity findById(Long id);

    void delete(Long id);

}
