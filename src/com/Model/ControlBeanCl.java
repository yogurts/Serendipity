package com.Model;

import java.sql.*;

import com.Core.DBOracle;

public class ControlBeanCl {
	
	private java.sql.Statement sm=null;
	private ResultSet rs=null;
	private Connection conn=null;
	
	DBOracle dbo =  new DBOracle();
	
	//验证股票名称是否存在
	public boolean checkStockName(String stockName){

		try {
			
			//到数据库中去验证
			conn = dbo.getConn();
			//创建Statement
			sm=conn.createStatement();
			
			//查询
			
			String sql = "select count(*) from ita.tb_stock t where STOCK_NAME ='"+ stockName + "'";
			rs=sm.executeQuery(sql);
			
			//判断结果
			if (rs.next()) {
				if (rs.getString(1).equals("1")) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
			
			} catch (Exception e) {
			e.printStackTrace();
		} finally{
			//关闭资源
			dbo.closeDB(conn, sm, rs);
		}
		return false;

	}

}
