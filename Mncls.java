package bbb;

public class Mncls {

	public static void main(String[] args) {
		Parcls p = new Parcls();
		p.dummy();
		System.out.println(p.dummy2());
		System.out.println(p.dummy3());

		Parcls2 p2 = new Parcls2();
		Parcls2.Inscls ins = (Parcls2.Inscls) p2.retobj();
		ins.Tester();

		Parcls3.Inscls.Meth1();
		Parcls4.Testa();
		Parcls4.Testb();
		Parcls4.dummy6();

		Insface f = new Insface() {

			@Override
			public void meth2() {
				// TODO Auto-generated method stub
				System.out.println("Interface2");
			}

			@Override
			public void meth1() {
				// TODO Auto-generated method stub
				System.out.println("Interface1");
			}
		};
		f.meth1();
		f.meth2();
		
		
		Absclss a=new Absclss() {
			
			@Override
			public void meth3() {
				// TODO Auto-generated method stub
				System.out.println("ye bann gayi abstract class just like interfaces by just clicking ctrl plus ? and enter. just wow!");
			}
		};
		a.meth3();
		a.meth4();
		
		int3 i8=new int3() {
			
			@Override
			public void Meth78977() {
				// TODO Auto-generated method stub
				System.out.println("too gooood");
			}
			
			@Override
			public void Meth79796() {
				// TODO Auto-generated method stub
				System.out.println("toooooooooooogooooooooooddddddddddddd");
			}
		};
		i8.Meth78977();
		i8.Meth79796();
	}

}
