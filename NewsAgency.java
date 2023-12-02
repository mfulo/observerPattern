package observerPattern;
import java.util.*;

public class NewsAgency implements NewsSubject{
	private String news;
	private List<Subscriber> subscriberList;

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public List<Subscriber> getSubscriberList() {
		return subscriberList;
	}

	public void setSubscriberList(List<Subscriber> subscriberList) {
		this.subscriberList = subscriberList;
	}

	@Override
	public void subscribe(Subscriber subscriber) {
		subscriberList.add(subscriber);
	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		subscriberList.remove(subscriber);
	}

	@Override
	public String notifySubscriber(String subscriberName) {
		String out = "\nDear " + subscriberName + ",\n"
				+ "We are thrilled to share with you the latest news: \n" + news;
		return out;
	}
}
