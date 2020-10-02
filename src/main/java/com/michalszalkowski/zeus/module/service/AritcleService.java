package com.michalszalkowski.zeus.module.service;

import com.michalszalkowski.zeus.module.dashboard.dto.ArticleDto;
import com.michalszalkowski.zeus.module.dashboard.dto.CommentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AritcleService {

    public ArticleDto getArticle() {
        return new ArticleDto()
                .setTitle("AWS Certified Cloud Practitioner (CLF0C01)")
                .setText("Lorem ipsum...")
                .setComments(
                        List.of(
                                new CommentDto("admin", "text 1"),
                                new CommentDto("admin", "text 2"),
                                new CommentDto("admin", "text 3")

                        )
                );
    }
}
