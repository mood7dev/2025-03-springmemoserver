package com.green.memoserver.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//응답(Response) 객체
@NoArgsConstructor
@Getter
@Setter
public class MemoGetRes {
    private String id;
    private String title;
    private String content;
    private String createdAt;
}


