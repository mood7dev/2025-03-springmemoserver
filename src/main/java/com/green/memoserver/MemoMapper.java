package com.green.memoserver;

import com.green.memoserver.model.MemoGetOneRes;
import com.green.memoserver.model.MemoGetReq;
import com.green.memoserver.model.MemoGetRes;
import com.green.memoserver.model.MemoPostReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemoMapper {
    int save(MemoPostReq P);
    List<MemoGetRes> findAll(MemoGetReq p);
    MemoGetOneRes findById(int id);
}

// 인터페이스 이름 변경

/*
findAll은 여러 메모를 조회할 수 있으니,
→ 메모 하나하나가 MemoGetRes 객체 한 개
→ 여러 개 모으면 List<MemoGetRes> 가 됨

save / 메모저장 / int / 저장된 행 수 반환
findAll / 조건에 맞는 여러 메모 조회 / List<MemoGetRes>  / 여러 메모 데이터 리스트 반환
 */