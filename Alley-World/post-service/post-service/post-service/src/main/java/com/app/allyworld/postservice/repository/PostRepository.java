package com.app.allyworld.postservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.allyworld.postservice.entity.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, Integer>{

	public List<Post> findPostByProfileId(int profileId);
	
}
