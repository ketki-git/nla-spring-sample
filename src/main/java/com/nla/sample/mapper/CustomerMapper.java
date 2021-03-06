package com.nla.sample.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nla.sample.model.Customer;

/**
 * A row mapper between Customer object and table row-column
 * 
 * @author Ketki
 *
 */
public class CustomerMapper implements RowMapper<Customer> {

	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setCustomerId(rs.getLong("CUSTOMER_ID"));
		customer.setCustomerName(rs.getString("CUSTOMER_NAME"));
		customer.setCustomerAddress(rs.getString("CUSTOMER_ADDRESS"));
		customer.setCustomerCity(rs.getString("CUSTOMER_CITY"));
		customer.setCustomerState(rs.getString("CUSTOMER_STATE"));
		customer.setCustomerZip(rs.getString("CUSTOMER_ZIP_POSTAL"));
		customer.setCustomerPhone(rs.getString("CUSTOMER_PHONE"));
		customer.setCustomerEmail(rs.getString("CUSTOMER_EMAIL"));
		return customer;
	}

}