package com.korit.springboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class HttpStudyController2 {

    @GetMapping("/age")
    public Map<String, Object> getAge() {
        Map<String, Object> introduce = new HashMap<>();
        introduce.put("name", "김규철");
        introduce.put("age", 22);
        return introduce;

//        return Map.of("name", "김규철", "age", 22);      추가나 제거가 안됌
    }

    @GetMapping("/names")
    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        names.add("김규철");
        names.add("김규쳘");
        names.add("김규찰");
        return names;
//        return List.of("김규철", "김규쳘", "김규찰");      // 스트링 배열도 가능함.
    }

    @GetMapping("/students")
    public List<Map<String, Object>> getStudents() {
        List<Map<String, Object>> stuIntroduce = new ArrayList<>();
        Map<String, Object> stringObjectMap = new HashMap<>();
        Map<String, Object> stringObjectMap2 = new HashMap<>();
        stringObjectMap.put("name", "김규철");
        stringObjectMap.put("age", 22);
        stringObjectMap2.put("name", "김규쳘");
        stringObjectMap2.put("age", 22);
        stuIntroduce.add(stringObjectMap);
        stuIntroduce.add(stringObjectMap2);
        return stuIntroduce;

//        return List.of(
//                Map.of("name", "김규철", "age", 22),
//                Map.of("name", "김규쳘", "age", 22)
//        );
    }

    @GetMapping("/students2")
    public List<Map<String, Object>> getStudents2() {
        List<Map<String, Object>> stuIntroduce = new ArrayList<>();
        Map<String, Object> stringObjectMap = new HashMap<>();
        Map<String, Object> stringObjectMap2 = new HashMap<>();
        List<String> hobby = new ArrayList<>();
        List<String> hobby2 = new ArrayList<>();
        hobby.add("축구");
        hobby.add("농구");
        hobby2.add("골프");
        hobby2.add("낚시");
        stringObjectMap.put("name", "김규철");
        stringObjectMap.put("age", 22);
        stringObjectMap.put("hobby", hobby);
        stringObjectMap2.put("name", "김규쳘");
        stringObjectMap2.put("age", 22);
        stringObjectMap2.put("hobby", hobby2);
        stuIntroduce.add(stringObjectMap);
        stuIntroduce.add(stringObjectMap2);
        return stuIntroduce;

//        return List.of(
//                Map.of("name", "김규철", "age", 22, "hobby", List.of("축구", "농구")),
//                Map.of("name", "김규쳘", "age", 22, "hobby", List.of("골프", "낚시"))
//        );
    }
}
