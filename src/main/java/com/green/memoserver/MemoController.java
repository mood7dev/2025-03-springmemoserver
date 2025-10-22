package com.green.memoserver;

import com.green.memoserver.config.model.ResultResponse;
import com.green.memoserver.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // RESTful 웹 서비스를 만들 때 사용하는 컨트롤러
@RequiredArgsConstructor //생성자를 자동 생성
@RequestMapping("api/memo")
@Slf4j //로그 출력
public class MemoController {

    private final MemoService memoService;

    // 메모 저장
    @PostMapping
    public ResultResponse<Integer> saveMemo(@RequestBody MemoPostReq p) {
        log.info("save={}", p);
        int result = memoService.save(p);
        return new ResultResponse<>("저장 성공", result);
    }

    // 메모 수정
    @PutMapping
    public ResultResponse<Integer> updateMemo(@RequestBody MemoPutReq p) {
        log.info("modify={}", p);
        int result = memoService.modify(p);
        return new ResultResponse<>("수정 성공", result);
    }

    // 메모 삭제
    @DeleteMapping
    public ResultResponse<Integer> delMemo(@RequestParam(name = "memo_id") int memoId) {
        log.info("delete={}", memoId);
        int result = memoService.delete(memoId);
        return new ResultResponse<>("삭제 성공", result);
    }

    // 메모 리스트 조회
    @GetMapping
    public ResultResponse<List<MemoGetRes>> getMemoList(@ModelAttribute MemoGetReq p) {
        log.info("findAll={}", p);
        List<MemoGetRes> result = memoService.findAll(p);
        String message = String.format("rows: %d", result.size());
        return new ResultResponse<>(message, result);
    }

    // 메모 하나 조회
    @GetMapping("{id}")
    public ResultResponse<MemoGetOneRes> getMemo(@PathVariable int id) {
        log.info("findById={}", id);
        MemoGetOneRes result = memoService.findById(id);
        return new ResultResponse<>("조회 성공", result);
    }
}



