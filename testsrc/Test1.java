

public class Test1 {
	
	static{
		System.out.println("---" + Test1.class.getName() + " : main の初期化ここから");
	}
	static Hoge hoge = new Hoge();
	static{
		System.out.println("---" + Test1.class.getName() + " : main の初期化ここまで");
	}
	
	
	Test1(){
		System.out.println("****" + Test1.class.getName() + " : Test1クラスのコンストラクタ");
	}
	
	private void internalFunc(int n)
	{
		System.out.println("========== internalFunc =============");		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--- main の処理ここから");
		Hoge hoge = new Hoge();
		System.out.println("--- main の処理ここまで");
		Test1 testclass = new Test1();
		testclass.internalFunc(10);
	}
	static class Hoge{
			
		static Bar bar1 = new Bar("bar1 - static");
		Bar bar2 = new Bar("bar2");
			
		static{
			System.out.println(Hoge.class.getName() + " : スタティックイニシャライザだよ♪");
		}
		{
			System.out.println(Hoge.class.getName() + " : インスタンスイニシャライザだよ♪");
		}
		static Bar bar3 = new Bar("bar3 - static");
		Bar bar4 = new Bar("bar4");
		Hoge(){
			System.out.println(Hoge.class.getName() + " : コンストラクタだよ♪");
		}
	}
	static class Bar{
		Bar(String text){
			System.out.println(Bar.class.getName() +  " : コンストラクタだよ♪ : " + text);
		}
	}
}
