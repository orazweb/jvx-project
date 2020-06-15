package com.wildcodeschool.disco_project.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public
class AppConfig {
    public SqlConfig mysql;
    private String hello;

    public String getHello() {
        return hello;
    }
    public void setHello(String hello) {
        this.hello = hello;
    }
    public SqlConfig getMysql() {
        return mysql;
    }
    public void setMysql(SqlConfig mysql) {
        this.mysql = mysql;
    }
}


