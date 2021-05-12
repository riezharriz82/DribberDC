package com.austral.jibberjabberposts.service.impl;

import com.austral.jibberjabberposts.dto.PostCreationDto;
import com.austral.jibberjabberposts.dto.PostInfoDto;
import com.austral.jibberjabberposts.dto.PostListingDto;
import com.austral.jibberjabberposts.model.Post;
import com.austral.jibberjabberposts.repository.PostRepository;
import com.austral.jibberjabberposts.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostListingDto getAllPosts() {
        List<Post> posts = postRepository.findAll();
        return PostListingDto.from(posts);
    }

    @Override
    public PostInfoDto createPost(PostCreationDto postDto) {
        Post postToSave = Post.builder()
                .createdBy(postDto.getCreatedBy())
                .content(postDto.getContent())
                .build();
        Post savedPost = postRepository.save(postToSave);
        return PostInfoDto.from(savedPost);
    }

    @Override
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
