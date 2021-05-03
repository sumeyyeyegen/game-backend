package gameBackend;

public interface CampaignService {
	void add(Campaign campaign, Game game);
	void update(Campaign campaign,Game game);
	void delete(Campaign campaign,Game game);
}
