package com.oa.controller;

import com.github.pagehelper.Page;
import com.oa.common.JsonResult;
import com.oa.entity.User;
import com.oa.entity.Week;
import com.oa.service.WeekService;
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
 * @Time: 2020/9/29 16:34
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping("/week")
public class WeekController {

    @Autowired
    private WeekService weekService;

    @RequestMapping("/add.do")
    public JsonResult addWeek(String title , String content, HttpSession session){
        User user = (User) session.getAttribute(StrUtil.LOGIN_USER);
        Week week = new Week();
        week.setTitle(title);
        week.setContent(content);
        week.setStatus(1);
        week.setU_no(user.getNo());
        weekService.addWeek(week);
        return new JsonResult(1,"添加成功!");
    }

    @RequestMapping("/queryWeek.do")
    public Map<String , Object> queryWeek(Integer page,Integer limit){
        List<Week> list = weekService.select(page, limit);
        long total = ((Page) list).getTotal();

        Map<String , Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;
    }

    @RequestMapping("/update.do")
    public JsonResult update(String id, String title, String content, Integer status, String createTime, String u_no){
        Week week = new Week();
        week.setId(Integer.parseInt(id));
        week.setTitle(title);
        week.setContent(content);
        week.setStatus(status);
        week.setCreateTime(createTime);
        week.setU_no(u_no);
        weekService.update(week);
        return new JsonResult(1,"修改成功");

    }

    /**
     * 查询周报内容并显示在修改界面的输入框内
     * @param id
     * @return
     */
    @RequestMapping("/queryWeekById.do")
    public JsonResult query(String id){
        return new JsonResult(1,weekService.selectById(Integer.parseInt(id)));
    }

    /**
     * 删除周报
     * @param id
     * @return
     */
    @RequestMapping("/deleteById.do")
    public JsonResult delete(Integer id){
        weekService.deleteById(id);
        return new JsonResult(1,"删除成功");
    }
}
