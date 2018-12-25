public class Student {
	private int dickeys;
	private Schedule schedule;
	private boolean isDicking;
	
	public Student(int d, Schedule s, boolean i)
	{
		dickeys = d;
		schedule = s;
		isDicking = i;
	}
	
	public int getDickeys() {
		return dickeys;
	}

	public boolean isDicking() {
		return isDicking;
	}
}