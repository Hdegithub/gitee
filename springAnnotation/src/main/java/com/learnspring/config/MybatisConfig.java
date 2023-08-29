package com.learnspring.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

//针对mybatis配置
public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFatoryBean(DataSource ds){
        //Mybatis session的工厂bean ，用来创建SqlSession的
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("com.learnspring.domain");
        ssfb.setDataSource(ds);
        return ssfb;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        //设置Mapper 扫描路径
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.learnspring.dao");
        return msc;
    }
}
