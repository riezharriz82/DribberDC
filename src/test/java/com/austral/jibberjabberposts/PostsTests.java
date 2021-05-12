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

    @Autowired
    private PostService postService;

    @Test
    void createPost() {
        PostCreationDto postCreationDto = new PostCreationDto("Nicolas Gioino", "Test Tweet!");
        PostInfoDto response = postService.createPost(postCreationDto);
        Assertions.assertEquals("Nicolas Gioino",response.getCreatedBy());
        Assertions.assertEquals("Test Tweet!",response.getContent());
    }

    @Test
    void checkPostCount() {
        PostCreationDto postCreationDto = new PostCreationDto("Nicolas Gioino", "Test Tweet!");
        postService.createPost(postCreationDto);
        postService.createPost(postCreationDto);
        postService.createPost(postCreationDto);
        PostListingDto postListingDto = postService.getAllPosts();
        Assertions.assertEquals(3,postListingDto.getPosts().size());
    }

    @Test
    void checkPostDeletedCorrectly() {
        PostCreationDto postCreationDto = new PostCreationDto("Nicolas Gioino", "Test Tweet!");
        PostInfoDto postInfoDto = postService.createPost(postCreationDto);
        postService.deletePost(postInfoDto.getId());
        PostListingDto postListingDto = postService.getAllPosts();
        Assertions.assertEquals(0,postListingDto.getPosts().size());
    }
}
