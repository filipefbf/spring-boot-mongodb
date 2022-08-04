package com.filipeferreira.workshopmongo.repository;

import com.filipeferreira.workshopmongo.domain.Post;
import com.filipeferreira.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
