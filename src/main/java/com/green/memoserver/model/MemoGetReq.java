package com.green.memoserver.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 요청(Request) 객체
@NoArgsConstructor
@Getter
@Setter
public class MemoGetReq {
    private String searchText;
    private Integer page;
}