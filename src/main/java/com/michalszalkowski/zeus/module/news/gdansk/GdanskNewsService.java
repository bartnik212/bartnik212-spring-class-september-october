package com.michalszalkowski.zeus.module.news.gdansk;

import com.michalszalkowski.zeus.module.news.NewsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GdanskNewsService implements NewsService {
    @Override
    public List<String> getLastNews() {
        return List.of(
                "1 - News from Gdansk...",
                "1 - News from Gdansk...",
                "1 - News from Gdansk...",
                "1 - News from Gdansk..."
                );
    }
}
