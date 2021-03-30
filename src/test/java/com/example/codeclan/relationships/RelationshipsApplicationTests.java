package com.example.codeclan.relationships;

import com.example.codeclan.relationships.models.Folders;
import com.example.codeclan.relationships.models.User;
import com.example.codeclan.relationships.repositories.FoldersRepository;
import com.example.codeclan.relationships.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RelationshipsApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FoldersRepository foldersRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUserFolders(){
		User user = new User("Otis Reading");
		userRepository.save(user);

		Folders folder = new Folders("Main", user);
		foldersRepository.save(folder);

	}

}
