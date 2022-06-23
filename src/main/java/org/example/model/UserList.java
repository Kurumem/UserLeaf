package org.example.model;

import org.springframework.stereotype.Component;


import java.util.HashSet;
import java.util.Set;


@Component
public class UserList {
    private Set<User> users =new HashSet<>();

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public UserList() {
    }

    public void add(User user){
        users.add(user);
    }

    public void clear(){
        users.clear();
    }
}

