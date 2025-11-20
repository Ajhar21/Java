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
 * H2 is a database which has default JDBC driver. but closing application  cause data loss
* ******************************************************************************************/

/********************** v191 - Creating A Spring JDBC Project ******************************************
 * make Scope prototype since we will create multiple object
 * ******************************************************************************************/

/********************** v193 - JDBCtemplate ******************************************
 * int row=jdbc.update(sql,s1.getRollNo(),s1.getsName(),s1.getMarks());
 * ******************************************************************************************/

@SpringBootApplication
public class SpringJdbcProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringJdbcProjectApplication.class, args);

        Student s1=context.getBean(Student.class);
        s1.setRollNo(1);
        s1.setsName("Ajhar");
        s1.setMarks(78);

        StudentService service=context.getBean(StudentService.class);
        service.addStudent(s1);

        List<Student> students=service.getStudent();
        System.out.println(students);

	}

}
