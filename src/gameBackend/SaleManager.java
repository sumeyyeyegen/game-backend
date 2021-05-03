package gameBackend;

public class SaleManager implements SaleService {

	@Override
	public void sell(User user, Game game, Campaign campaign) {
		if(campaign.getCampaignDays() > 0) {
			Utils.discountedPrice(game, campaign);
			System.out.println(game.getName() + " isimli oyununda "+ campaign.getCampaignDays() +" gün %" + campaign.getDiscountRate() + " oraninda indirim bulunmaktadir. Güncel fiyat : " + game.getDiscountedPrice());
		}
	}

}
