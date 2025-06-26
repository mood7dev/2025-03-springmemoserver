package com.green.memoserver;

import com.green.memoserver.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
`
import java.beans.ConstructorProperties;
import java.util.List;

//rest api
@RestController
//자동 생성
@RequiredArgsConstructor
//공통 url 정의
@RequestMapping("api/memo")
@Slf4j
public class MemoController {
    private final MemoService memoService;

    @PostMapping
    public String saveMemo(@RequestBody MemoPostReq req) {
        log.info("req={}", req);
        int result = memoService.save(req);
        return result == 1 ? "저장 성공" : "저장 실패";
    }

    @PutMapping
    public String updateMemo(@RequestBody MemoPutReq req) {
        log.info("req={}", req);
        return "수정완료";
    }

    @DeleteMapping
    public String deleteMemo(@RequestParam(name = "memo_id", required = false) int memoId) {
        log.info("memoId={}", memoId);
        return "삭제완료";
    }

    // 메모 하나 조회
    @GetMapping("{id}")
    public MemoGetOneRes getMemo(@PathVariable int id) {
        log.info("findById={}", id);
        return memoService.findById(id);
    }

    // 메모 리스트 조회
    @GetMapping
    public List<MemoGetRes> getMemos(@ModelAttribute MemoGetReq req) {
        log.info("req={}", req);
        return memoService.finAll(req);
    }

    @DeleteMapping("{id}")
    public String deleteMemos(@PathVariable int id) {
        log.info("id={}", id);
        return "삭제완료";
    }
}