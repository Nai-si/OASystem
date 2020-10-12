package com.oa.controller;

import com.github.pagehelper.Page;
import com.oa.common.JsonResult;
import com.oa.entity.Depart;
import com.oa.service.DepartService;
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
 * @Time: 2020/10/12 17:07
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping("/depart")
public class DepartController {
    @Autowired
    private DepartService departService;

    @RequestMapping("/departPage.do")
    public Map<String,Object> departPage(Integer page,Integer limit){
        List<Depart> list = departService.selectAllDepart(page, limit);
        long total = ((Page) list).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;
    }

    @RequestMapping("/updateDepart.do")
    public JsonResult updateDepart(Depart depart){
        departService.updateDepart(depart);
        return new JsonResult(1,"修改成功");
    }

    @RequestMapping("/addDepart.do")
    public JsonResult addDepart(Depart depart){
        departService.addDepart(depart);
        return new JsonResult(1,"添加成功");
    }

    @RequestMapping("/deleteDepart.do")
    public JsonResult deleteDepart(int id){
        departService.deleteDepart(id);
        return new JsonResult(1,"删除成功");
    }

}
