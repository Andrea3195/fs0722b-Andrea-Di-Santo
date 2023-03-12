package com.PS5.functionality.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.PS5.security.entity.User;
import com.PS5.security.repository.UserRepository;
import jakarta.persistence.EntityExistsException;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;
	
	public List<User> getAllUser() {
		return (List<User>) userRepo.findAll();
	}

	public User getUserById(Long id) {
		if (!userRepo.existsById(id)) {
			throw new EntityExistsException("Utente non trovato");
		}
		return userRepo.findById(id).get();
	}

	public User updateUser(User user) {
		if (!userRepo.existsById(user.getId())) {
			throw new EntityExistsException("Utente non trovato");
		}
		return userRepo.save(user);
	}
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}

	public String deleteUser(Long id) {
		if (!userRepo.existsById(id)) {
			throw new EntityExistsException("Utente non trovato");
		}
		userRepo.deleteById(id);
		return "Utente eliminato";
	}
}