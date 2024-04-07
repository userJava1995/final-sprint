package kz.bitlab.academy.finalsprint.commentaries.repository;

import kz.bitlab.academy.finalsprint.commentaries.entity.CommentEntity;
import kz.bitlab.academy.finalsprint.tasks.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {


}
