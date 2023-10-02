package tema8;

public class Qualification extends Teacher {
	
	public Qualification (String course, int experienceYears, String schedule) {
		 super.setCourse(course);
		 super.setExperienceYears(experienceYears);
		 super.setSchedule(schedule);
	}
	
	public void Verify() {
		
		if ((this.getExperienceYears() > 3) && (this.getCourse() == "Java") && (this.getSchedule() == "Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		}
			else {
				System.out.println("You do not qualify!");
			}
		}

}
