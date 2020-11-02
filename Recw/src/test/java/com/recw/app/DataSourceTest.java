package com.recw.app;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
//��ü���� OR locations ={"file:src/main/webapp/WEB-INF/spring/appServlet/root-context.xml"})
public class DataSourceTest {
	
	@Inject
	private DataSource ds;
	
	public void testConection()throws Exception{
		
		try (Connection con = ds.getConnection()){
			System.out.println(con);
			System.out.println("dataSource ���� ����");
			
		} catch (Exception e) {
			System.out.println("dataSource ���� ����");
			e.printStackTrace();
		}
	}

}
