package com.fsoft.Model.User;

import com.fsoft.Model.User.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User,String> {
}
