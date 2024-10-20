package cn.mybatis.mp.spring.boot.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("cn.mybatis.mp.spring.boot.demo.mapper")
@EnableTransactionManagement
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(DemoApplication.class, args);
        } catch (Throwable e) {
            e.printStackTrace();
            throw e;
        }
    }
}
