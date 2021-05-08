package registerLogin.business.concretes;

import registerLogin.business.abstracts.UserService;
import registerLogin.core.abtstracts.GoogleService;
import registerLogin.dataAccess.abstracts.UserDao;
import registerLogin.entities.concretes.User;

public class UserManager implements UserService {

	UserService userService;
	UserDao userDao;
	GoogleService googleService;

	public UserManager(UserService userService, UserDao userDao, GoogleService googleService) {
		super();
		this.userService = userService;
		this.userDao = userDao;
		this.googleService = googleService;
	}


	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� Silindi : " + user.getFirstName());

	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� G�ncellendi : " + user.getFirstName());

	}

	@Override
	public void register(User user) {
		if (user.getEmail() == null || user.getFirstName() == null || user.getLastName() == null
				|| user.getParola() == null) {
			System.out.println("Alanlar Bos Gecilemez");
		} else if (user.getParola().length() < 6) {
			System.out.println("Parola En Az 6 Karakter Olmal�");
		} else if (user.getFirstName().length() < 2 && user.getLastName().length() < 2) {
			System.out.println("Ad Soyad En Az 2 Karakter Olmal�d�r");
		} else {
			userDao.register(user);
		}
	}

	@Override
	public void login(User user) {
		if (user.getEmail() == null || user.getParola() == null) {
			System.out.println("Email ve parola giriniz");
			return;
		}else {
			userDao.login(user);
			return;
		}
	}

}
