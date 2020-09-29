package com.oa.controller;

import com.github.pagehelper.Page;
import com.oa.entity.Staff;
import com.oa.service.StaffService;
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
 * @Time: 2020/9/29 9:09
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    /**
     * 查询所有员工信息，并分页展示
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("/staffAll.do")
    public Map<String ,Object> selectStaffAll(Integer page,Integer limit){
        Map<String , Object> map = new HashMap<>();
        List<Staff> list = staffService.selectStaffAll(page, limit);
        long total = ((Page) list).getTotal();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;
    }

}
