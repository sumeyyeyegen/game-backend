package gameBackend;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager();
		User user1 = new User();
		user1.setFirstName("Sumeyye");
		user1.setLastName("Yegen");
		user1.setBirthYear("1998");
		user1.setId(1);
		user1.setIdentityNumber("123450000");
		userManager.register(user1);
		userManager.login(user1, "Sumeyye","Yegen","123450000","1998");
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setName("CSGo");
		game1.setPrice(2000);
		game1.setReleaseYear("2007");
		game1.setStock("4");
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setDiscountRate(10);
		campaign1.setCampaignDays(3);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sell(user1,game1,campaign1);
	}

}
