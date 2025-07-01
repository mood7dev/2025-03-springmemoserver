package com.green.memoserver;

import com.green.memoserver.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //생성자를 자동 생성
public class MemoService {
    private final MemoMapper memoMapper;

    // 메모 저장
    public int save(MemoPostReq p) {
        return memoMapper.save(p);
    }

    // 메모 수정
    public int modify(MemoPutReq p) {
        return memoMapper.modify(p);
    }

    // 메모 삭제
    public int delete(int id) {
        return memoMapper.delete(id);
    }

    // 메모 리스트 조회
    public List<MemoGetRes> findAll(MemoGetReq p) {
        return memoMapper.findAll(p);
    }

    // 메모 하나 조회
    public MemoGetOneRes findById(int id) {
        return memoMapper.findById(id);
    }
}
