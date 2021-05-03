package gameBackend;

public interface UserService {
	void register(User user);
	void update(User user);
	void delete(User user);
	void login(User user,String firstName,String lastName, String identityNumber,String birthYear);
}
