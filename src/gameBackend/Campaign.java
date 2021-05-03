package gameBackend;

public class Campaign {
	private int id;
	private int discountRate;
	private int campaignDays;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public int getCampaignDays() {
		return campaignDays;
	}
	public void setCampaignDays(int campaignDays) {
		this.campaignDays = campaignDays;
	}
	
}
