package gun3Odev2;

public class StudentManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.firstName+ " " + user.lastName+" "+ " adl� ��renci eklendi");
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.firstName+ " " +  user.lastName+" "+ " adl� ��renci silindi");
	}
	
	@Override
	public void update(User user) {
		System.out.println(user.firstName+ " " + user.getFirstName() +" "+  " adl� ��renci g�ncellendi");
	}
}
