package com.example.orginzation.department;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class DepartmentServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

	@Autowired
    DataSource dataSource;
	
	@Value("${spring.datasource.url}")
	String connection;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("DATASOURCE = " + connection);

    }
}
