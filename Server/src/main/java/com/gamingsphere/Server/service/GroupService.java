package com.gamingsphere.Server.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gamingsphere.Server.models.Group;
import com.gamingsphere.Server.respositories.GroupRepository;

@Service
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
       savedGroup.setUsers(group.getUsers());
       savedGroup.setPosts(group.getPosts()); 
       savedGroup.setDescription(group.getDescription());
       savedGroup.setTags(group.getTags());
       savedGroup.setImgUrl(group.getImgUrl());
       savedGroup.setMemberCount(group.getMemberCount());
       groupRepository.save(savedGroup);
    }
    
    public void deleteGroup(String id) {
        groupRepository.deleteById(id);
    }
    
}
