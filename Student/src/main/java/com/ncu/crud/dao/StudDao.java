package com.ncu.crud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ncu.crud.model.Student;

public class StudDao {
	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public int save(Student p){    
	    String sql="insert into student(id,name,marks,dept_name) values('"+p.getId()+"','"+p.getName()+"',"+p.getMarks()+",'"+p.getDept_name()+"')";    
	    return template.update(sql);    
	}    
	public int update(Student p){    
	    String sql="update student set name='"+p.getName()+"', marks="+p.getMarks()+", dept_name='"+p.getDept_name()+"' where id="+p.getId()+"";    
	    return template.update(sql);    
	}    
	public int delete(int id){    
	    String sql="delete from student where id="+id+"";    
	    return template.update(sql);    
	}    
	public Student getEmpById(int id){    
	    String sql="select * from student where id=?";    
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Student>(Student.class));    
	}    
	public List<Student> getEmployees(){    
	    return template.query("select * from student",new RowMapper<Student>(){    
	        public Student mapRow(ResultSet rs, int row) throws SQLException {    
	        	Student e=new Student();    
	            e.setId(rs.getInt(1));    
	            e.setName(rs.getString(2));    
	            e.setMarks(rs.getInt(3));    
	            e.setDept_name(rs.getString(4));    
	            return e;    
	        }    
	    });    
	}    
}
