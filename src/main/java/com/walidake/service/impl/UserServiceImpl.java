package com.walidake.service.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Service;

import com.walidake.model.User;
import com.walidake.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addUser(final User user) {

		jdbcTemplate.update("insert into listener (name,password) values(?,?)",
				new PreparedStatementSetter() {
					public void setValues(PreparedStatement ps)
							throws SQLException {
						ps.setString(1, user.getName());
						ps.setString(2, user.getPassword());
					}

				});

	}

	public List<User> findUser() {
		return jdbcTemplate.query(
				"select * from listener", new BeanPropertyRowMapper<User>(User.class));
	}

}
