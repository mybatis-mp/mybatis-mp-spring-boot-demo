package cn.xbatis.spring.boot.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.DefaultParameterNameDiscoverer;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration(proxyBeanMethods = false)
public class DatasourceConfig {

//    @Bean
//    public DataSource getDataSource() {
//        DefaultParameterNameDiscoverer DD;
//
//        return new EmbeddedDatabaseBuilder()
//                .setName("test_db")
//                .setType(EmbeddedDatabaseType.H2)
//                .addScript("schema.sql")
//                .build();
//    }

}
