package chainOfResponsibility;
// 책임연쇄(ChainOfResponsibility)패턴 : 여러 개의 객체에 해당하는 메소드를 체인 방식으로
// 순차적 연결을 통하여 문제를 해결해나가는 자바 디자인 행위 패턴중의 한 방식
public class ChainOfResponsibilityEx {

	public static void main(String[] args) {
		
		Support alice = new NoSupport("Alice");
		Support bob = new LimitSupport("Bob", 100);
		Support charlie = new SpecialSupport("Charlie", 429);
		Support diana = new LimitSupport("Diana", 200);
		Support elmo = new OddSupport("Elmo");
		//메소드 체이닝
		alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo);
		//다양한 문제 발생
		for(int i=0;i<500;i+=33){
			alice.support(new Trouble(i));
		}
		
		
	}

}
