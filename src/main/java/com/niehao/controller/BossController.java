package com.niehao.controller;

import cn.hutool.core.util.ObjectUtil;
import com.niehao.error.AccountOrPasswordErrorException;
import com.niehao.http.HttpResult;
import com.niehao.model.Boss;
import com.niehao.service.BossService;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * ClassName: BossController
 * Package: com.niehao.controller
 * Description:
 *
 * @Author NieHao
 * @Create 2023/9/5 21:15
 * @Version 1.0
 */
@RestController
@RequestMapping("boss")
public class BossController {
    @Resource
    private BossService service;
    @RequestMapping(value = "login",method = {RequestMethod.GET,RequestMethod.POST})
    public HttpResult<Boss> login(Boss boss, HttpSession session){
        // 验证账号是否存在
        Boss data = service.queryAccount(boss.getAccount());
        if(ObjectUtil.isEmpty(data)){
            throw new AccountOrPasswordErrorException("账号或密码错误");
        }
        if (ObjectUtil.isEmpty(boss.getPassword())){
            throw new AccountOrPasswordErrorException("密码错误");
        }
        // 保存登陆后 session
        session.setAttribute("BossId",boss.getBossId());
        session.setAttribute("Time",boss.getDate());
        return HttpResult.SUCCESS(data,"登陆成功");
    }
}
