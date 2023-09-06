package com.niehao.service;

import com.niehao.mapper.TreeMapper;
import com.niehao.model.Tree;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName: TreeSevice
 * Package: com.niehao.service
 * Description:
 *
 * @Author NieHao
 * @Create 2023/9/5 22:12
 * @Version 1.0
 */

public interface TreeService {

    List<Tree> queryTrees()throws Exception;

}
