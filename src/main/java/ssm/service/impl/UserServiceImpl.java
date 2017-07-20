package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.UserDao;
import ssm.entity.User;
import ssm.service.UserService;

import java.util.List;

/**
 * Created by white on 17/8/15.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void add(User u) {
        userDao.add(u);
    }

    @Override
    public User login(User u) {
        return userDao.getUserByAuth(u);
    }

}
