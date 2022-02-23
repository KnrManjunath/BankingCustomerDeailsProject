package com.npci.demo.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;
import com.npci.demo.dao.CustomerDao;
import com.npci.demo.response.TranscationResponse;

@Repository
public class CustomerDaoimpl extends NamedParameterJdbcDaoSupport implements CustomerDao {
	@Autowired JdbcTemplate jdbcTemplate;
	private List transcation;
	public List<TranscationResponse> getTranscationResponses() {
		// TODO Auto-generated method stub
		try {
			String query = "select t.trans_id,c.name,t.trans_amount as amount,t.to_c_id" + "from custometrs as c" + "join transcation as t" +"on c.c_id = t.c_id;";
			transcation = getNamedParameterJdbcTemplate()
					.getJdbcOperations()
					.query(
							query,
							new BeanPropertyRowMapper<TranscationResponse>(
									TranscationResponse.class
									));
			} catch (Exception e) {
				//TODO: handle exception
				e.getStackTrace();
			}
		
			return transcation;
	}
	public List<TranscationResponse> getTransDetail() {
		// TODO Auto-generated method stub
		return null;
	}

}
