package team.odds.conferencedemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Autowired
    private Environment env;

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url(env.getProperty("DB_URL"));
        builder.username(env.getProperty("DB_USERNAME"));
        builder.password(env.getProperty("DB_PASSWORD"));
        System.out.println("My custom datasource bean has been initialized and set");
        return builder.build();
    }
}
