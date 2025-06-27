package com.green.memoserver;

import com.green.memoserver.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/memo")
@Slf4j
public class MemoController {

    private final MemoService memoService;

    // 메모 저장
    @PostMapping
    public int saveMemo(@RequestBody MemoPostReq p) {
        log.info("save={}", p);
        return memoService.save(p);
    }

    // 메모 수정
    @PutMapping
    public int updateMemo(@RequestBody MemoPutReq p) {
        log.info("modify={}", p);
        return memoService.modify(p);
    }

    // 메모 삭제
    @DeleteMapping
    public int deleteMemoByQuery(@RequestParam(name = "memo_id") int memoId) {
        log.info("delete={}", memoId);
        return memoService.delete(memoId);
    }

    // 메모 리스트 조회
    @GetMapping
    public List<MemoGetRes> getMemos(@ModelAttribute MemoGetReq p) {
        log.info("findAll={}", p);
        return memoService.findAll(p);
    }

    // 메모 하나 조회
    @GetMapping("{id}")
    public MemoGetOneRes getMemo(@PathVariable int id) {
        log.info("findById={}", id);
        return memoService.findById(id);
    }
}
