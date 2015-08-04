package com.Model;

import java.sql.*;

public class ControlBeanCl {
	
	private java.sql.Statement sm=null;
	private ResultSet rs=null;
	private Connection conn=null;
	private String stockName=null;
	
	//验证股票名称是否存在
	public boolean checkStockName(String stockName){

		try {
			
			//到数据库中去验证
			conn=new ConnDB().getConn();
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
			this.close();
		}
		return true;

	}


	//关闭资源函数
	public void close(){
		
		try {
			if (rs!=null) {
				rs.close();
				rs=null;
			}
			if (sm!=null) {
				sm.close();
				sm=null;
			}
			if (conn!=null) {
				conn.close();
				conn=null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
