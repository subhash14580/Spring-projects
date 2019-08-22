
/*public class BuilderDesignPatter {
		private int a;
		private int b;
		private class sub_class{
			public void _h1() {
				System.out.println("Sample program");
				System.out.println();
			}
		}
		public static void main(String args[]) {
			BuilderDesignPatter d = new BuilderDesignPatter();
			BuilderDesignPatter d1 = new BuilderDesignPatter();
			System.out.println(d == d1);
		}
}*/

public class BuilderDesignPatter{

public static void main(String args[]){

	BuilderDesignPatter t1 = new BuilderDesignPatter();

	BuilderDesignPatter t2 = new BuilderDesignPatter();

System.out.println(t1.getClass());

int a = t1.hashCode();

int b = t2.hashCode();

System.out.println("t1 object hash code: " + a);

System.out.println("t2 object hash code: " + b);

if(t1.equals(t2))

System.out.println("t1 and t2 refers the same");

else

System.out.println("t1 and t2 does not refer the same");

BuilderDesignPatter t3, t4;

t3 = t1;

t4 = t1;

if(t3.equals(t4))

System.out.println("t3 and t4 refers the same");

else

System.out.println("t3 and t4 does not refer the same");

}

}
