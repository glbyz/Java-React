package gameproject;

public class GamerManager implements GamerService {

	UserCheckService userCheckService;

	public GamerManager(UserCheckService userCheckService) {
		
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if (userCheckService.checkIfUser(gamer)) {
			System.out.println("Kimlik Do�ruland�");
			System.out.println("Kaydedildi :" + gamer.firstName + " " + gamer.lastName);
		}else {
			System.out.println("Kimlik do�rulanamad�...");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullan�c� bilgileri g�ncellendi");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullan�c� silindi");
	}

}
