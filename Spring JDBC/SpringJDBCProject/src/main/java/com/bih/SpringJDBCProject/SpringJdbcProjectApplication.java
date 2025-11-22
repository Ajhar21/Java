package com.bih.SpringJDBCProject;

import com.bih.SpringJDBCProject.model.Student;
import com.bih.SpringJDBCProject.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

/********************** v190 - Spring JDBC Intro ******************************************
* JDBCTemplate has 4 features
 * 1.Connect with Database
 * 2.Fire queries
 * 3.Process data
 * 4.Get output
 * Data Source is helpful to interact database multiple times with single connection
 * H2 is an embedded in-memory database which has default JDBC driver. but closing application  cause data loss
* ******************************************************************************************/

/********************** v191 - Creating A Spring JDBC Project ******************************************
 * make Scope prototype since we will create multiple object
 * ******************************************************************************************/

/********************** v193 - JDBCtemplate ******************************************
 * In Spring JDBC, JDBCtemplate class is used to simplify database operations
 * int row=jdbc.update(sql,s1.getRollNo(),s1.getsName(),s1.getMarks());
 * update(sql,parameters) for insert
 * query(sql,RowMapper) for select query
 * ******************************************************************************************/

/********************** v194 - Schema & Data Files ******************************************
 * under resources folder add schema.sql & data.sql files
 * H2 driver will load those sql
 * ******************************************************************************************/

/********************** v195 - Rowmapper interface ******************************************
 * Rowmapper is a dunctional interface which has mapRow function returns row
 * get ResultSet from mapRow, convert it to object & return object
 * ******************************************************************************************/

/********************** v196 - Spring JDBC postgres ******************************************
 * nothing change in source code
 * configure application.properties file with below properties:
 * 1.spring.datasource.url
 * 2.spring.datasource.username
 * 3.spring.datasource.password
 * 4.spring.datasource.driver-class-name
 * ******************************************************************************************/

@SpringBootApplication
public class SpringJdbcProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringJdbcProjectApplication.class, args);

        Student s1=context.getBean(Student.class);
        s1.setRollNo(104);
        s1.setsName("Anoy");
        s1.setMarks(80);

        StudentService service=context.getBean(StudentService.class);
        service.addStudent(s1);

        List<Student> students=service.getStudent();
        System.out.println(students);

	}

}
