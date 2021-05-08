package registerLogin.dataAccess.concretes;

import registerLogin.dataAccess.abstracts.UserDao;
import registerLogin.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void register(User user) {
		System.out.println("Uyeli�inizin tamamlanmas� i�in epostan�z� do�rulay�n�z");
		System.out.println("Eposta Do�ruland�");
		System.out.println("Uye Olma Islemi Basarli : " + user.getFirstName());		
	}

	@Override
	public void login(User user) {
		System.out.println("Giris Yapma Islemi Basarili : " + user.getFirstName());
	}

}
