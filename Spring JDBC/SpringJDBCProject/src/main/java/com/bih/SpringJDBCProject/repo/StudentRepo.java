package com.bih.SpringJDBCProject.repo;

import com.bih.SpringJDBCProject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s1) {
        String sql = "insert into student(rollNo,sName,marks) values(?,?,?)";
        int row = jdbc.update(sql, s1.getRollNo(), s1.getsName(), s1.getMarks());
        System.out.println(row + " effected");
    }

    public List<Student> findAll() {

        String sql = "select * from student";
        /*
        RowMapper mapper= new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s=new Student();
                s.setRollNo(rs.getInt("rollNo"));
                s.setsName(rs.getString("sName"));
                s.setMarks(rs.getInt("marks"));
                return s;
            }
        };
        */

        /*
        RowMapper mapper= ( rs,  rowNum) -> {
                Student s=new Student();
                s.setRollNo(rs.getInt("rollNo"));
                s.setsName(rs.getString("sName"));
                s.setMarks(rs.getInt("marks"));
                return s;
        };

        return jdbc.query(sql,mapper);

        */

        return jdbc.query(sql,(rs, rowNum) -> {
            Student s = new Student();
            s.setRollNo(rs.getInt("rollNo"));
            s.setsName(rs.getString("sName"));
            s.setMarks(rs.getInt("marks"));
            return s;
        });
    }
}
