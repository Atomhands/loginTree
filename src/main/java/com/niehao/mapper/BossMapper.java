package com.niehao.mapper;

import com.niehao.model.Boss;
import org.apache.ibatis.type.Alias;

/**
 * ClassName: BossMapper
 * Package: com.niehao.mapper
 * Description:
 *
 * @Author NieHao
 * @Create 2023/9/5 21:16
 * @Version 1.0
 */
@Alias("Boss")
public interface BossMapper {
    Boss queryAccount(String account);
}
