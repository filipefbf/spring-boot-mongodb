package com.filipeferreira.workshopmongo.services;

import com.filipeferreira.workshopmongo.domain.Post;
import com.filipeferreira.workshopmongo.domain.User;
import com.filipeferreira.workshopmongo.dto.UserDTO;
import com.filipeferreira.workshopmongo.repository.PostRepository;
import com.filipeferreira.workshopmongo.repository.UserRepository;
import com.filipeferreira.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findBytitle(String text) {
        return repository.searchTitle(text);
    }

    public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
        maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
        return repository.fullSearch(text, minDate, maxDate);
    }
}
