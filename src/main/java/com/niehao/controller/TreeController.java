package com.niehao.controller;

import com.niehao.http.HttpResult;
import com.niehao.model.Tree;
import com.niehao.service.TreeService;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName: TreeController
 * Package: com.niehao.controller
 * Description:
 *
 * @Author NieHao
 * @Create 2023/9/5 22:11
 * @Version 1.0
 */
@RestController
public class TreeController {
    @Resource
    private TreeService service;
    @RequestMapping(value = "tree")
    public HttpResult<List<Tree>> trees()throws Exception{
        List<Tree> trees = service.queryTrees();
        return HttpResult.SUCCESS(trees,"success");
    }
}
