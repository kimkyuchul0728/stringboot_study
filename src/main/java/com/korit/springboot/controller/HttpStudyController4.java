package com.korit.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/*
    REST API(RESTful API)
    요청과 응답
    https://m.blog.naver.com/codingbarbie/223233477242
    https://hahahoho5915.tistory.com/54#google_vignette
 */
@RestController
public class HttpStudyController4 {

//    @GetMapping("/api/study/http/get")
    public ResponseEntity <Map<String, Object>> get() {
//        return new ResponseEntity<>(Map.of("name", "김규철", "age", 22), HttpStatus.BAD_REQUEST);
        return ResponseEntity.badRequest().body(Map.of("name", "김규철", "age", 22));
    }
}
