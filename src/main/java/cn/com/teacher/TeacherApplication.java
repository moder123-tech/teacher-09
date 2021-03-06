package cn.com.teacher;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @author Administrator
 */
@SpringBootApplication
public class TeacherApplication {


    public static void main(String[] args) {
        SpringApplication.run(TeacherApplication.class, args);
    }

}
