package pack05;

public class FuncTest_OverloadMain {

	public static void main(String[] args) {

		FuncTest_Overload fto = new FuncTest_Overload();

		fto.getResult(1);
		fto.getResult("A");
		fto.getResult('A');
		fto.getResult(1, "A");

	}

}
