package com.app.allyworld.postservice.servicetesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.app.allyworld.postservice.entity.Post;
import com.app.allyworld.postservice.service.PostServiceImpl;

public class PostServiceTesting {

	@Autowired
	private Post post;
	@Test
	public void testGetAllPosts()
	{
		PostServiceImpl service = new PostServiceImpl();
		assertEquals(HttpStatus.OK,service.addNewPost(post));
	}
}
