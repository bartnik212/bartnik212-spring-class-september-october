package com.michalszalkowski.zeus.module.dashboard.dto;

public class MenuDto {
    private String name;
    private String url;

    public MenuDto(String url, String name) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "MenuDto{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
