package com.gamingsphere.Server.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.gamingsphere.Server.models.Group;
import com.gamingsphere.Server.models.User;
import com.gamingsphere.Server.respositories.GroupRepository;

public class GroupService {
    private final GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public List<Group> getGroups() {
        return groupRepository.findAll();
    }

    public Optional<Group> getGroupByID(String id) {
        return groupRepository.findById(id);
    }

    public void addGroup(Group group){
        groupRepository.insert(group);
    }

    public void updateGroup(Group group, String id) {
        Group savedGroup = groupRepository.findById(id)
                                      .orElseThrow(() -> new RuntimeException(String.format("Cannot Find Group By ID %s", id)));
       savedGroup.setGame(group.getGame());
       savedGroup.setUserIds(group.getUserIds()); 
    }
    
    public void deleteGroup(String id) {
        groupRepository.deleteById(id);
    }

    // return all of the user information of a particular group
    public List<String> getGroupUsersIds(Group group) {
        Group savedGroup = groupRepository.findById(group.getId())
                                      .orElseThrow(() -> new RuntimeException(String.format("Cannot Find Group By ID %s", group.getId())));
    
        return savedGroup.getUserIds();
    }
}
