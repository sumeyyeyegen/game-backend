package gameBackend;

public interface UserService {
	void register(User user);
	void login(User user);
	void update(User user);
	void delete(User user);
}
