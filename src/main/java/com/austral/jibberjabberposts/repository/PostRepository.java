package com.austral.jibberjabberposts.repository;

import com.austral.jibberjabberposts.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {
}
