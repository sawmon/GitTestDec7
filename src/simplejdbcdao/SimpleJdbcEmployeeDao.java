package simplejdbcdao;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.object.SqlQuery;

import pojo.Employee;

import daointerface.UserDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
public class SimpleJdbcEmployeeDao extends SimpleJdbcDaoSupport implements UserDao{

	@Override
	public Employee getEmployee(String id, String password) {
		
		return getSimpleJdbcTemplate().queryForObject("select * from payemployee",
				new ParameterizedRowMapper<Employee>(){
			public Employee mapRow(java.sql.ResultSet res, int arg1)throws java.sql.SQLException {
				Employee e=new Employee();
				e.setEmployeeId(res.getString(1));
				e.setEmployeeName(res.getString(2));
				e.setDeptId(res.getString(3));
				e.setPosition(res.getString(4));
				e.setFatherName(res.getString(5));
				e.setMotherName(res.getString(6));
				e.setPermentAddress(res.getString(7));
				e.setCurrentAddress(res.getString(8));
				e.setNationalId(res.getString(9));
				e.setEmail(res.getString(10));
				e.setSalaryPerDay(res.getInt(11));
				e.setOvertimeRatePerHour(res.getInt(12));
				e.setAccNumber(res.getString(13));
				e.setStatus(res.getString(14));
				return e;
				
			};
		}		
		, id,password);
	}
	
	
	

}
