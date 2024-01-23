package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



/*
 * 
 * 날짜 : 2024/01/23
 * 이름 : 최형욱
 * 내용 : PreparedStatement 실습하기
 * 
 * PreparedStatement
 *  - 기존 Statement 보다 향상된 동적 SQL 생성으 ㄹ위한 Statement
 *  - Query Parameter를 사용해서 값을 Mapping(사상, 바인딩) 해서 쿼리 실행
 *  
 *  
 *  VO객체
 *  - VO(Value Object)객체는 SELECT의 결과 테이블 속성을 갖는 객체
 *  - 테이블 개체(Entity)를 객체(Object)로 변환할 때 사용하는 객체
 *  - Spring에스는 DTO(Data Transfer Object)로 사용
 */
public class PreparedSelectTest {
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "sunnet123";
		String pass = "abc1234";
		
		// 결과처리 리스트
		List<User4VO> users = new ArrayList<>();
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn =DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행 객체 생성
			String sql = "SELECT * FROM `User4`";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 4단계 - SQL 실행
			ResultSet rs = psmt.executeQuery();
			
			// 5단계 - 결과처리(SELECT 경우)
			while(rs.next()) {
				// 커서가 가르키는 튜플 결과 가져오기
				String uid		= rs.getString(1);
				String name		= rs.getString(2);
				String gender	= rs.getString(3);
				int	   age		= rs.getInt(4);
				String hp		= rs.getString(5);
				String addr		= rs.getString(6);
				
				User4VO vo = new User4VO();
				vo.setUid(uid);
				vo.setName(name);
				vo.setGender(gender);
				vo.setHp(hp);
				vo.setAge(age);
				vo.setAddr(addr);
				
				users.add(vo);
				//System.out.printf("%s, %s, %s, %s, %d%n", uid, name, birth, hp, age);
			}
			
			// 6단계 - 데이터베이스 종료
			rs.close();
			psmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		for(User4VO vo : users) {
			System.out.printf("%s, %s, %s, %d, %s, %s%n", vo.getUid(), vo.getName(), vo.getGender(), vo.getAge(), vo.getHp(), vo.getAddr());
		}
		
		System.out.println("SELECT 완료...");
	}
}
