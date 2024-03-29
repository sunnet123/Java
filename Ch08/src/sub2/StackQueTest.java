package sub2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 
 * 날짜 : 2024/01/10
 * 이름 : 최형욱
 * 내용 : Java 스택, 큐 실습하기
 */
public class StackQueTest {

	public static void main(String[] args) {
		
		// 컬렉션 기본타입을 취급 안함
		// 스택
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		while(!stack.empty()) {
			
			System.out.println(stack.pop() + " ");
		}
		
		// 큐
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("서울");
		queue.offer("대전");
		queue.offer("대구");
		queue.offer("부산");
		queue.offer("광주");
		
		while(queue.isEmpty()) {
			System.out.print(queue.poll() + " ");
		}
	}
}
