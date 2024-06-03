package com.gamingsphere.Server.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamingsphere.Server.models.Group;
import com.gamingsphere.Server.service.GroupService;

@RestController
@RequestMapping("/api/group")
public class GroupController {
    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Group>> getGroups() {
        return ResponseEntity.ok(groupService.getGroups());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Group>> getGroupById(@PathVariable String id) {
        return ResponseEntity.ok(groupService.getGroupByID(id));
    }

    @PostMapping("/add")
    public ResponseEntity addGroup(Group group) {
        groupService.addGroup(group);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteGroup(@PathVariable String id) {
        groupService.deleteGroup(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateGroup(@PathVariable Group group, @PathVariable String id) {
        groupService.updateGroup(group, id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<List<String>> getGroupUserIds(@PathVariable String id) {
        return ResponseEntity.ok(groupService.getGroupUsersIds(id));
    }


}
