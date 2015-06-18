package com.AITAM.demo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.AITAM.demo.bean.EmpBean;

public class GetDetails {
	public EmpBean getDetails(EmpBean emp) throws ClassNotFoundException, SQLException{
		Connection conn= Connect.connect();
		ResultSet rs1= null;
		Statement st1=null;
		ResultSet rs= null;
		Statement st=null;
		try{
			st1= conn.createStatement();
			rs1= st1.executeQuery("select * from AITAM_EMPLOYEE where ID=" + emp.getID());
			while(rs1.next()){
				emp.setMail(rs1.getString(3));
				emp.setPhone(rs1.getLong(4));
				emp.setSupervisor(rs1.getInt(5));
				st= conn.createStatement();
				rs= st.executeQuery("select NAME from AITAM_EMPLOYEE where ID=" + rs1.getInt(5));
				while(rs.next()){
					emp.setSup_Name(rs.getString(1));
				}
			}
		}
		finally{
			if(rs1!=null){
				rs1.close();
			}
			if(st1!=null){
				st1.close();
			}
			if(rs!=null){
				rs.close();
			}
			if(st!=null){
				st.close();
			}
			conn.close();
		}
				
		return emp;
	}
}
