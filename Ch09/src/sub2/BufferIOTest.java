package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * 
 * 
 * 
 */
public class BufferIOTest {
	public static void main(String[] args) {
		
	
		String source = "C:\\Users\\java\\Desktop\\Java.zip";
		String target = "C:\\Users\\java\\Desktop\\JavaCopy.zip";
	
		try {
			// 스트림 생성(연결)
			FileInputStream	 fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
		
			// 보조 스트림 생성
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			
			while(true) {
			
			// 파일 읽기
			int data = fis.read();
			
			if(data == -1) {
				// 파일 모두 읽었을 때 반복 종료
				break;
			}
			
			//char ch = (char)data;
			
			//System.out.print(ch);
			
			// 파일 쓰기
			bos.write(data);
		}
		
		// 스트림 해체
		bos.flush();
		
		bis.close();
		bos.close();
		
		fis.close();
		fos.close();
		
		} catch (Exception e) {
		
		e.printStackTrace();
		} 
	
		System.out.println("프로그램 종료...");
	}
}
