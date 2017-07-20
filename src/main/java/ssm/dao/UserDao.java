package ssm.dao;
/*
 * Copyright (C) 2017 white <white@localhost>
 *
 * Distributed under terms of the MIT license.
 */

import org.springframework.stereotype.Repository;
import ssm.entity.User;

import java.util.List;

@Repository
public interface UserDao {
    List<User> findAll();
    void add(User u);
    User getUserByAuth(User u);
}

