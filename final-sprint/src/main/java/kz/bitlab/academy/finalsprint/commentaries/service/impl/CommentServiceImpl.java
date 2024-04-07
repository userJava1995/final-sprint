package kz.bitlab.academy.finalsprint.commentaries.service.impl;

import kz.bitlab.academy.finalsprint.commentaries.entity.CommentEntity;
import kz.bitlab.academy.finalsprint.commentaries.repository.CommentRepository;
import kz.bitlab.academy.finalsprint.commentaries.service.CommentService;
import kz.bitlab.academy.finalsprint.tasks.entity.TaskEntity;
import kz.bitlab.academy.finalsprint.tasks.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository repository;
    private final TaskRepository taskRepository;

    @Override
    public void create(Long taskId, String commentTask) {
        TaskEntity task = taskRepository.findById(taskId)
                .orElseThrow(() -> new RuntimeException("Task not found!"));
        CommentEntity commentEntity = new CommentEntity();
        commentEntity.setName(commentTask);
        commentEntity.setTask(task);
        repository.save(commentEntity);
//        List<CommentEntity> comments = task.getComments();
//        comments.add(commentEntity);
//        task.setComments(comments);
//        taskRepository.save(task);
    }

    @Override
    public List<CommentEntity> findAllByTask(Long taskId) {
        TaskEntity task = taskRepository.findById(taskId)
                .orElseThrow(() -> new RuntimeException("Task not found!"));
        return null;
    }

    @Override
    public CommentEntity findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Comment not found!"));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
