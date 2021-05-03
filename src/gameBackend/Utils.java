package gameBackend;

public class Utils {
	public static void discountedPrice(Game game, Campaign campaign) {
		int newPrice = game.getPrice()- (game.getPrice() * campaign.getDiscountRate()/100 );
		game.setDiscountedPrice(newPrice);
	}
}
