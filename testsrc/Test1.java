

public class Test1 {
	
	static{
		System.out.println("---" + Test1.class.getName() + " : main �̏�������������");
	}
	static Hoge hoge = new Hoge();
	static{
		System.out.println("---" + Test1.class.getName() + " : main �̏����������܂�");
	}
	
	
	Test1(){
		System.out.println("****" + Test1.class.getName() + " : Test1�N���X�̃R���X�g���N�^");
	}
	
	private void internalFunc(int n)
	{
		System.out.println("========== internalFunc =============");		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--- main �̏�����������");
		Hoge hoge = new Hoge();
		System.out.println("--- main �̏��������܂�");
		Test1 testclass = new Test1();
		testclass.internalFunc(10);
	}
	static class Hoge{
			
		static Bar bar1 = new Bar("bar1 - static");
		Bar bar2 = new Bar("bar2");
			
		static{
			System.out.println(Hoge.class.getName() + " : �X�^�e�B�b�N�C�j�V�����C�U�����");
		}
		{
			System.out.println(Hoge.class.getName() + " : �C���X�^���X�C�j�V�����C�U�����");
		}
		static Bar bar3 = new Bar("bar3 - static");
		Bar bar4 = new Bar("bar4");
		Hoge(){
			System.out.println(Hoge.class.getName() + " : �R���X�g���N�^�����");
		}
	}
	static class Bar{
		Bar(String text){
			System.out.println(Bar.class.getName() +  " : �R���X�g���N�^����� : " + text);
		}
	}
}
