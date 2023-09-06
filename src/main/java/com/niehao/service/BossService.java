package com.niehao.service;

import com.niehao.mapper.BossMapper;
import com.niehao.model.Boss;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName: BossService
 * Package: com.niehao.service
 * Description:
 *
 * @Author NieHao
 * @Create 2023/9/5 21:16
 * @Version 1.0
 */
@Service
public class BossService {
    @Resource
    private BossMapper mapper;
    public Boss queryAccount(String account) {
        return mapper.queryAccount(account);
    }
}
