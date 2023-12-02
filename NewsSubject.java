package observerPattern;

public interface NewsSubject {
	public void subscribe (Subscriber subscriber);
	public void unsubscribe (Subscriber subscriber);
	public String notifySubscriber (String subscriberName);
}
