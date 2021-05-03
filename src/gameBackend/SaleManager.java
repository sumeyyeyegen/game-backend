package gameBackend;

public class SaleManager implements SaleService {

	@Override
	public void sell(User user, Game game, Campaign campaign) {
		if(campaign.getCampaignDays() > 0) {
			Utils.discountedPrice(game, campaign);
			System.out.println(game.getName() + " isimli oyununda "+ campaign.getCampaignDays() +" g�n %" + campaign.getDiscountRate() + " oraninda indirim bulunmaktadir. G�ncel fiyat : " + game.getDiscountedPrice());
		}
	}

}
