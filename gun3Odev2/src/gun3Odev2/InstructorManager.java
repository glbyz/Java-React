package gun3Odev2;

public class InstructorManager extends UserManager {
	
	@Override
	public void add(User user) {
		
		System.out.println(user.firstName+ "  "+ user.lastName+ " " + " adl� e�itmen usereklendi");
	}
	
	public void update(Instructor instructor ) {
		System.out.println(instructor.instructorNumber + " " + "numaral� E�itmen "+ 
	instructor.firstName+ " " +  " "+ instructor.lastName + " G�ncellendi" );
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.firstName+ user.lastName+" "+  " adl� e�itmen silindi");
	}
}
