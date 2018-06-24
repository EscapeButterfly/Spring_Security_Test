package com.vitaliigorovoii.springauthtest.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Simple JavaBean domain object that represents role of {@link User}.
 *
 * @author Vitalii Gorovoii
 */

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "roles")
    @Transient
    private Set<User> users;

    public Role() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        if(name.equalsIgnoreCase("ROLE_ADMIN")){
            return "ADMIN";
        }else{
            return "USER";
        }
    }
}
