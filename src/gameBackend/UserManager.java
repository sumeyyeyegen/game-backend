package gameBackend;

public class UserManager implements UserService{

	@Override
	public void register(User user) {
		System.out.println("Kullanici sayfaya kayit oldu. " + user.getFirstName()+ " " +user.getLastName());
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanici guncellendi. "+user.getFirstName()+user.getLastName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanici silindi. "+user.getFirstName()+user.getLastName());
	}

	@Override
	public void login(User user,String firstName,String lastName, String identityNumber,String birthYear) {
		if(user.getIdentityNumber()==identityNumber && user.getFirstName()==firstName && user.getBirthYear()==birthYear && user.getLastName()==lastName) {
			System.out.println("Kullanici girisi basarili");
		}else {
			System.out.println("Kullanici bilgileri yanlis. Lutfen bilgilerinizi kontrol ediniz.");
		}
	}
	
}
