package com.example.dao;

import java.util.List;
import java.util.Optional;

import javax.swing.tree.RowMapper;

import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.model.Employee;

import ch.qos.logback.classic.Logger;

@Component
public class EmpJdbcDao implements Dao<Employee>{
	
	private static final Logger log=(Logger) LoggerFactory.getLogger(EmpJdbcDao.class);
	private JdbcTemplate jdbcTemplate;
	

	
	public EmpJdbcDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}



	@Override
	public List<Employee> list() {
		String sql="SELECT empid, empfname, emplname, age, emailid, phoneno, city\n"
				+ "	FROM public.employee;";
		return jdbcTemplate.query(sql,new EmployeeRowMapper());
	}



	@Override
	public int create(Employee t) {
		// TODO Auto-generated method stub
		var sql ="INSERT INTO employee(empid,empfname,emplname,age,emailid,phoneNo,city) values (?,?,?,?,?,?,?)";
	
		return jdbcTemplate.update(sql,t.getEmpid(),t.getEmpfname(),t.getEmplname(),t.getAge(),t.getEmailid(),t.getPhoneNo(),t.getCity());
	}



	@Override
	public int update(Employee t, int empid) {
		   var sql="UPDATE employee set empfname=? WHERE empid=?";
	        return jdbcTemplate.update(sql,t.getEmpfname(),empid);
	 
	}



	@Override
	public int delete(int empid) {
		 var sql ="DELETE FROM employee WHERE empid=?";
	        return jdbcTemplate.update(sql,empid);
	}


	
	

}
