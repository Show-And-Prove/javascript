package adapter;
//현재 있는 Human과 Student를 각자 사용하기에 너무 빈약하여
//클래스를 혼합하여 HumanAdapter 클래스 생성
public class HumanAdapter extends Human implements Student{
	
	public HumanAdapter(String name, int age){
		super(name, age);
	}
	
	@Override
	public void showName(){
		showName();
	}

	@Override
	public void showAge(){
		showAge();
	}
	
}
