package com.springboot.blog.payload;

import java.util.Set;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(description = "PostDto Model Information")
public class PostDto {
    private long id;

    @Schema(description = "Blog Post Title")
    // post title should not be null or empty
    @NotEmpty
    // post title should have at least 2 characters
    @Size(min = 2, message = "Post title should have at least 2 characters.")
    private String title;

    @Schema(description = "Blog Post Description")
    // post description should not be null or empty
    @NotEmpty
    // post description should have at least 10 characters
    @Size(min = 10, message = "Post description should have at least 10 characters.")
    private String description;

    @Schema(description = "Blog Post Content")
    // post content should not be null or empty
    @NotEmpty
    private String content;

    private Set<CommentDto> comments;

    @Schema(description = "Blog Post Category")
    private long categoryId;
}
