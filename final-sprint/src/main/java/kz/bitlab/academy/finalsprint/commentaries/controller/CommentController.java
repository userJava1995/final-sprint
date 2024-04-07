package kz.bitlab.academy.finalsprint.commentaries.controller;

import kz.bitlab.academy.finalsprint.commentaries.entity.CommentEntity;
import kz.bitlab.academy.finalsprint.commentaries.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class CommentController {

    private final CommentService service;

//    @GetMapping("/tasks/{id}/create")
//    public String commentForm(Model model){
//        CommentEntity comment = new CommentEntity();
//        model.addAttribute("comment", comment);
//        return "detailsTask";
//    }

    @PostMapping("/tasks/{id}/create")
    public String create(@PathVariable Long id, @RequestParam String name){
        service.create(id, name);
        return "redirect:/tasks/{id}";
    }
}
