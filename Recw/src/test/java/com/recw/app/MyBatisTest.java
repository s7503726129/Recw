package com.recw.app;


import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
//전체설정 OR locations ={"file:src/main/webapp/WEB-INF/spring/appServlet/root-context.xml"})
public class MyBatisTest {
	
	@Inject
	private SqlSessionFactory sqlFactory;
	
	public void testFactory(){
		System.out.println(sqlFactory);
	}
	
	public void testSession()throws Exception{
		
		try (SqlSession session = sqlFactory.openSession()){
			System.out.println(session);
			System.out.println("SqlSession 설정 성공");
			
		} catch (Exception e) {
			System.out.println("SqlSession 설정 실패");
			e.printStackTrace();
		}
	}

}
