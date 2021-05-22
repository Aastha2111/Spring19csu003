package com.ncu.SessionDemo.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ncu.SessionDemo.model.SessionUsers;

//class UserMapper implements RowMapper<SessionUsers>{
	
//	@Override
//	public SessionUsers mapRow(ResultSet rs, int rowNum) throws SQLException {
//		// TODO Auto-generated method stub
//		
//		SessionUsers user = new SessionUsers();
//		 user.setEmail(rs.getString("email"));
//         user.setPassword(rs.getString("password"));
//         user.setFname(rs.getString("fname"));
//         user.setLname(rs.getString("lname"));
//         user.setAge(rs.getInt("age"));
//		return   user;
//		
//		
//	}
	
//}

@Repository
public class MyUserDaoImpl implements MyUserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public MyUserDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	@Override
	public void saveOrUpdate(SessionUsers user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String email) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public SessionUsers get(String email) {
		String sql = "SELECT * FROM userdetails where email='" + email + "'";
	    return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(SessionUsers.class));
		
	}
	@Override
	public List<SessionUsers> list() {
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        String sql = "SELECT * from users";
//        List<User> listUser = jdbcTemplate.query(sql,new RowMapper<User>()  {
// 
//         @Override
//			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//				  User user = new User();
//	                user.setEmail(rs.getString("puneet.gmail.com"));
//	                user.setPassword(rs.getString("abc@123"));
//	                user.setFname(rs.getString("Puneet"));
//	                return user;
//				
//			}
//             
//        });
//        return listUser;
        return null;
	}

}
