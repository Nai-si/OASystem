package com.oa.controller;

import com.github.pagehelper.Page;
import com.oa.common.JsonResult;
import com.oa.entity.Anonymity;
import com.oa.entity.User;
import com.oa.service.AnonymityService;
import com.oa.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/30 14:52
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping("/anonymity")
public class AnonymityController {

    @Autowired
    private AnonymityService anonymityService;

    /**
     * 匿名投诉分页展示
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("/queryAnonymity.do")
    public Map<String,Object> query(Integer page,Integer limit){
        List<Anonymity> list = anonymityService.selectAll(page, limit);
        long total = ((Page)list).getTotal();
        Map<String ,Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;

    }

    /**
     * 添加匿名投诉
     * @param content
     * @param session
     * @return
     */
    @RequestMapping("/add.do")
    public JsonResult add(String content, HttpSession session){
        User user = (User) session.getAttribute(StrUtil.LOGIN_USER);
        anonymityService.add(content,user.getNo());
        return new JsonResult(1,"投诉成功！");
    }
}
