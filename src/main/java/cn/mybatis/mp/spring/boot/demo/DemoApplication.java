package cn.mybatis.mp.spring.boot.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Configurable
@MapperScan("cn.mybatis.mp.spring.boot.demo.mapper")
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(DemoApplication.class, args);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
