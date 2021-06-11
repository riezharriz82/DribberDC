package com.austral.jibberjabberposts;

import com.austral.jibberjabberposts.dto.PostCreationDto;
import com.austral.jibberjabberposts.dto.PostInfoDto;
import com.austral.jibberjabberposts.dto.PostListingDto;
import com.austral.jibberjabberposts.service.PostService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@SpringBootTest
@ActiveProfiles("tests")
@Transactional
public class PostsTests {
//TODO MOCK REST CALL TO USERS SERVICE

//    @Autowired
//    private PostService postService;
//
//    @Test
//    void createPost() {
//        PostCreationDto postCreationDto = new PostCreationDto("Test Tweet!");
//        PostInfoDto response = postService.createPost(postCreationDto,"mockedId");
//        Assertions.assertEquals("Test Tweet!",response.getContent());
//    }
//
//    @Test
//    void checkPostCount() {
//        PostCreationDto postCreationDto = new PostCreationDto("Test Tweet!");
//        postService.createPost(postCreationDto,"mockedId");
//        postService.createPost(postCreationDto,"mockedId");
//        postService.createPost(postCreationDto,"mockedId");
//        PostListingDto postListingDto = postService.getAllPosts();
//        Assertions.assertEquals(3,postListingDto.getPosts().size());
//    }
//
//    @Test
//    void checkPostDeletedCorrectly() {
//        PostCreationDto postCreationDto = new PostCreationDto("Test Tweet!");
//        PostInfoDto postInfoDto = postService.createPost(postCreationDto,"mockedId");
//        postService.deletePost(postInfoDto.getId());
//        PostListingDto postListingDto = postService.getAllPosts();
//        Assertions.assertEquals(0,postListingDto.getPosts().size());
//    }
}
