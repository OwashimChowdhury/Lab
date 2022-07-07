package Lab;

class Teacher{
	String designation="designation is teacher,";
	String collegename=" college is IMPS";
	void work() {
		System.out.println("work is Teaching");
	}
}
 class ITteacher extends Teacher {

	public static void main(String[] args) {
		ITteacher te=new ITteacher();
		System.out.println(te.designation+" "+te.collegename);
		te.work();
	}

}
