package com.green.memoserver.model;

import lombok.Getter;

@Getter
public class MemoGetOneRes {
    private int id;  // @JsonProperty("memoId") 삭제
    private String title;
    private String content;  // @JsonProperty("ctnts") 삭제
    private String createdAt;
}