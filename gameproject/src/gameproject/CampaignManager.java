package gameproject;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Kaydedildi");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi");
	}

}
