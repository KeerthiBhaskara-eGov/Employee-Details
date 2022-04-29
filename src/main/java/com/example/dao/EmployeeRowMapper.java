package com.example.dao;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper <Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Employee(rs.getInt("empid"),rs.getString("empfname"),
        		rs.getString("emplname"),rs.getInt("age"),rs.getString("emailid"),
        		rs.getString("phoneNo"),rs.getString("city"));
            
    }
}
