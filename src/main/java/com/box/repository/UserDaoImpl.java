package com.box.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.box.model.User;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int addUser(User user) {
		String sql = "insert into user(user_id,user_name,user_password,user_type,user_tel) values(?,?,?,?,?)";
	      return this.jdbcTemplate.update(
	            sql,
	            user.getId(),
	            user.getName(),
	            user.getPassword(),
	            user.getType(),
	            user.getTel()
	      );
	}

	public int deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User getUserByTel(String tel) {
		User user;
		try {
			String sql = "select * from user where user_tel = ?";
			user = this.jdbcTemplate.queryForObject(sql, new RowMapper<User>() {

		         public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		            User user = new User();
		            if(rs.wasNull()) {
		            	user = null;
		            }else {
		            	user.setId(rs.getInt("user_id"));
			            user.setName(rs.getString("user_name"));
			            user.setPassword(rs.getString("user_password"));
			            user.setTel(rs.getString("user_tel"));
			            user.setType(rs.getString("user_type"));
		            }
		            
		            return user;
		         }

		      }, tel);
		}catch(EmptyResultDataAccessException e) {
			user = null;
		}
		return user;
	}

	public List<Map<String, Object>> getAllUsers() {
		
		String sql = "select * from user";
		List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
		return maps;
	}

}
