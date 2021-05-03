package gameBackend;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign,Game game) {
		System.out.println("Kampanya eklendi.");
		System.out.println(game.getName() + " isimli oyun " + campaign.getCampaignDays() + " gunlugune %" + campaign.getDiscountRate()+ " oraninda indirime girmistir." );
	}

	@Override
	public void update(Campaign campaign,Game game) {
		System.out.println(game.getName() + " isimli oyunda " + campaign.getCampaignDays() + " gun gecerli kampanya guncellendi.");
	}

	@Override
	public void delete(Campaign campaign,Game game) {
		System.out.println(game.getName() + " isimli oyunda " + campaign.getCampaignDays() + " gun gecerli kampanya sona erdi.");
	}
	
}
