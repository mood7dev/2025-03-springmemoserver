package com.green.memoserver;

import com.green.memoserver.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemoMapper {
    int save(MemoPostReq p); // 메모 저장
    int modify(MemoPutReq p); // 메모 수정
    int delete(int id); // 메모 삭제
    List<MemoGetRes> findAll(MemoGetReq p); // 메모 리스트 조회
    MemoGetOneRes findById(int id); // 메모 하나 조회

}

// 인터페이스 이름 변경

/*
findAll은 여러 메모를 조회할 수 있으니,
→ 메모 하나하나가 MemoGetRes 객체 한 개
→ 여러 개 모으면 List<MemoGetRes> 가 됨

save / 메모저장 / int / 저장된 행 수 반환
findAll / 조건에 맞는 여러 메모 조회 / List<MemoGetRes>  / 여러 메모 데이터 리스트 반환
 */