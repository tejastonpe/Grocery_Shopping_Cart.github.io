
package com.dao;

import javax.activation.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.model.User;

public abstract  class UserDAOImpl implements UserDAO {
 
    private JdbcTemplate jdbcTemplate;
 
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate();
    }
 
    public void saveUser(User user) {
        String sql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getEmail());
    }

	
 
}
