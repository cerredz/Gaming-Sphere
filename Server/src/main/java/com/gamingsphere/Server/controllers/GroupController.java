package com.gamingsphere.Server.controllers;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        List<Group> groups = groupService.getGroups();
        return ResponseEntity.ok(groups);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Optional<Group>> getGroupByID(@PathVariable String id) {
        Optional<Group> group = groupService.getGroupByID(id);
        return ResponseEntity.ok(group);
    }

    @GetMapping("/get/users")
    public ResponseEntity<List<String>> getGroupUsersIds(@RequestBody Group group) {
        List<String> userIds = groupService.getGroupUsersIds(group);
        return ResponseEntity.ok(userIds);
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addGroup(@RequestBody Group group) {
        groupService.addGroup(group);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateGroup(@RequestBody Group group, @PathVariable String id) {
        groupService.updateGroup(group, id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteGroup(@PathVariable String id) {
        groupService.deleteGroup(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
