package com.oa.controller;

import com.github.pagehelper.Page;
import com.oa.common.JsonResult;
import com.oa.entity.User;
import com.oa.entity.Vip;
import com.oa.service.VipService;
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
 * @Time: 2020/9/30 9:24
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping("/vip")
public class VipController {

    @Autowired
    private VipService vipService;

    /**
     * vip申请分页展示
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("/queryVip.do")
    public Map<String ,Object> query(Integer page,Integer limit){
        List<Vip> list = vipService.select(page, limit);
        long total = ((Page) list).getTotal();

        Map<String , Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;
    }

    /**
     * 添加vip申请
     * @param content
     * @param session
     * @return
     */
    @RequestMapping("/add.do")
    public JsonResult add(String content, HttpSession session){
        User user = (User) session.getAttribute(StrUtil.LOGIN_USER);

        Vip vip = new Vip();
        vip.setContent(content);
        vip.setU_no(user.getNo());

        vipService.add(vip);
        return new JsonResult(1,"添加成功");
    }
}
