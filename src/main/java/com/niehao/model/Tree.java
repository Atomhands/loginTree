package com.niehao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.List;

/**
 * ClassName: Tree
 * Package: com.niehao.model
 * Description:
 *
 * @Author NieHao
 * @Create 2023/9/5 22:14
 * @Version 1.0
 */
@NoArgsConstructor
@Alias("tree")
@AllArgsConstructor
@Data
public class Tree {
    private String id;
    private String text;
    private String iconCls;
    private String url;
    private String pid;
    private List<Tree> children;

    public List<Tree> getChildren() {
        return children!=null&&children.size()==0 ? null:children;
    }
}
