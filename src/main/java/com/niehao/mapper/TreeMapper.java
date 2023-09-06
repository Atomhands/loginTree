package com.niehao.mapper;

import com.niehao.model.Tree;

import java.util.List;

/**
 * ClassName: TreeMapper
 * Package: com.niehao.mapper
 * Description:
 *
 * @Author NieHao
 * @Create 2023/9/5 22:12
 * @Version 1.0
 */
public interface TreeMapper {
    //菜单树
    //根节点
    List<Tree> selectRoot();
    //子节点
    List<Tree> selectChild();
}
