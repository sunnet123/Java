package ch11.sec04;
/*
 * 날짜 : 2024/01/18
 * 이름 : 최형욱
 * 내용 : 11장 리소스 자동 닫기
 */
public class TryWithResourceExample {
	public static void main(String[] args) {
		try(MyResource res = new MyResource("A")){
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch (Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
		
		try(MyResource res = new MyResource("A")){
			String data = res.read2();
			//NumberFormatException 발생
			int value = Integer.parseInt(data);
		} catch (Exception e) {
		
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
		
		MyResource res1 = new MyResource("A");
		MyResource res2 = new MyResource("B");
		try(res1; res2){
			String data1 = res1.read1();
			String data2 = res2.read1();
			
		}catch (Exception e) {
			System.out.println("예외 처리 : " + e.getMessage());
		}
	}
}
