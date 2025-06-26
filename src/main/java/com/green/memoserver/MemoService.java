package com.green.memoserver;

import com.green.memoserver.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//자동 생성
@RequiredArgsConstructor
public class MemoService {
    private final MemoMapper memoMapper;

    public int save(MemoPostReq P) {
        return memoMapper.save(P);
    }

    public List<MemoGetRes> finAll(MemoGetReq req) {
        return memoMapper.findAll(req);
    }

    public MemoGetOneRes findById(int id) {
        return memoMapper.findById(id);
    }

}
