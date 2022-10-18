package singletone;
//singleton : 인스턴스를 한 개만 만들 수 있도록 하는 패턴
public class SingleTon {
	static Singleton instance;
	
	private Singleton()	{ }
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}

}

