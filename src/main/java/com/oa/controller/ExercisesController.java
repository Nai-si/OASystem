package com.oa.controller;

import com.github.pagehelper.Page;
import com.oa.entity.Exercises;
import com.oa.service.ExercisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/10/5 17:25
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping("/exer")
public class ExercisesController {

    @Autowired
    private ExercisesService exercisesService;

    @RequestMapping("/select.do")
    public Map<String,Object> query(Integer page, Integer limit){
        List<Exercises> list = exercisesService.select(page, limit);
        long total = ((Page) list).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg", "");
        map.put("count",total);
        map.put("data", list);
        return map;
    }

}
