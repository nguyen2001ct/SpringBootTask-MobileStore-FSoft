package com.fsoft;

import com.fsoft.Model.User.User;
import com.fsoft.Model.User.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
    @Autowired
    private UserRepository repo;
    @Test
    public void testAddNew(){
        User user = new User();
        user.setUsername("customer");
        user.setPassword("customer");
        user.setTypeofuserid(2);
        User savedUser=repo.save(user);
        Assertions.assertThat(savedUser).isNotNull();
    }
}
