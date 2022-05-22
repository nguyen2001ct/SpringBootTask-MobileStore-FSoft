package com.fsoft;

import com.fsoft.Model.Cart.Cart;
import com.fsoft.Model.Cart.CartRepository;
import com.fsoft.Model.Cart.CartService;
import com.fsoft.Model.User.User;
import com.fsoft.Model.User.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)

public class CartRepositoryTest {
    @Autowired
    private CartRepository repo;
    @Autowired
    private UserRepository userrepo;
    @Test
    public void testCart(){
        Cart newcart = new Cart();
        List<User> listAll = (List<User>) userrepo.findAll();
        System.out.println(listAll.get(1).getUsername());
        newcart.setUsername(listAll.get(1).getUsername());
        Cart savedUser=repo.save(newcart);
        Assertions.assertThat(savedUser).isNotNull();
    }
}
