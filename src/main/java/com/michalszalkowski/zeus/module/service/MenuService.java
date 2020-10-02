package com.michalszalkowski.zeus.module.service;

import com.michalszalkowski.zeus.module.dashboard.dto.MenuDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    public List<MenuDto> getMenu() {
        return List.of(
                new MenuDto("http://michalszalkowski.com/aws/", "AWS"),
                new MenuDto("http://michalszalkowski.com/security/", "Security"),
                new MenuDto("http://michalszalkowski.com/java/", "Java")
        );
    }
}
