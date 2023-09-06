package com.niehao.service.impl;

import com.niehao.mapper.TreeMapper;
import com.niehao.model.Tree;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName: TreeService
 * Package: com.niehao.service.impl
 * Description:
 *
 * @Author NieHao
 * @Create 2023/9/5 22:20
 * @Version 1.0
 */
@Service
public class TreeServiceImpl implements com.niehao.service.TreeService {
    @Resource
    private TreeMapper mapper;
    @Override
    public List<Tree> queryTrees() throws Exception{
        List<Tree> trees = mapper.selectRoot();
        return trees;
    }
}
