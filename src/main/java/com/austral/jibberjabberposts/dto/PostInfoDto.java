package com.austral.jibberjabberposts.dto;

import com.austral.jibberjabberposts.model.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostInfoDto {

    private Long id;

    private String createdBy;

    LocalDateTime createdTime;

    String content;

    public static PostInfoDto from(Post post) {
        return new PostInfoDto(post.getId(), post.getCreatedBy(), post.getCreatedTime(), post.getContent());
    }
}
