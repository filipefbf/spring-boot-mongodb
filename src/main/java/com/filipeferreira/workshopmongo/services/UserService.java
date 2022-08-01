package com.filipeferreira.workshopmongo.services;

import com.filipeferreira.workshopmongo.domain.entities.User;
import com.filipeferreira.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
