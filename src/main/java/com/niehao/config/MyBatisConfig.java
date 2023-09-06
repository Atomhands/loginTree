package com.niehao.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: MyBatisConfig
 * Package: com.niehao.config
 * Description:
 *
 * @Author NieHao
 * @Create 2023/9/5 21:03
 * @Version 1.0
 */
@Configuration
@MapperScan("com.niehao.mapper")
public class MyBatisConfig {
}
