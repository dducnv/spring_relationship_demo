package com.example.demorelationship.api;

import com.example.demorelationship.entity.Post;
import com.example.demorelationship.repository.AccountRepository;
import com.example.demorelationship.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class WebController {
    @Autowired
    AccountRepository accountRepository;

    @Autowired
    PostRepository postRepository;


    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public ResponseEntity<?> accountFindAll() {
        return ResponseEntity.ok(accountRepository.findAll());
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ResponseEntity<?> postFindAll() {
        return ResponseEntity.ok(postRepository.findAll());
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> postFindById(@PathVariable Long id) {
        return ResponseEntity.ok(postRepository.findById(id));
    }

    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody Post post) {
        return ResponseEntity.ok(postRepository.save(post));
    }

}
