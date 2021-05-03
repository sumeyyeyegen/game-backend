package gameBackend;

public class GameManager implements GameService {
	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " isimli oyun sisteme eklendi.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " isimli oyun bilgileri guncellendi.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " isimli oyun sistemden silindi.");
	}
	
}
