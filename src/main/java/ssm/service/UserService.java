package ssm.service;

import org.springframework.stereotype.Service;
import ssm.entity.User;

import java.util.List;

/**
 * Created by white on 17/7/20.
 */

@Service
public interface UserService {

    List<User> findAll();

    void add(User u);

    User login(User u);

}
