public class ExceptionHandlerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String estaturaStr ="1.89m";
		// taken from http://stackoverflow.com/questions/7586305/how-to-know-which-exception-is-thrown
		try {
			float estatura = Float.parseFloat(estaturaStr);
			} catch (RuntimeException estatura){
			   System.out.println(estatura.getClass().getName());
			   // taken from http://stackoverflow.com/questions/5679254/all-super-classes-of-a-class
			   System.out.println("Getting all supper classes\n");
			   Class C = estatura.getClass();
			   while (C!=null){
				   System.out.println(C.getName());
				   C = C.getSuperclass();
			   }
			}
	}

}
