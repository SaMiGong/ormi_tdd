package com.example.tddtest2.repository;

import com.example.tddtest2.entity.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@TestPropertySource(locations = "classpath:application.yml")
public class UserRepositoryTest {

  @Autowired private TestEntityManager entityManager;

  @Autowired private UserRepository userRepository;

  @Test
  public void testFindByEmail(){
    User user = new User("test@gmail.com", "password", "max");
    userRepository.save(user);

//    entityManager.persist(user);
//    entityManager.flush();

    User found = userRepository.findByEmail("test@gmail.com");

    assertThat(found.getPassword()).isEqualTo(user.getPassword());
    assertThat(found.getEmail()).isEqualTo(user.getEmail());
    assertThat(found.getName()).isEqualTo(user.getName());
  }
}