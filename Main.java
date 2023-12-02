package observerPattern;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        List<Subscriber> subscriberList = new ArrayList<>();
        
        while (true) {
        	String news = "1. Overseas: Israel releases 30 Palestinian prisoners in latest exchange\n"
					+ "2. Entertainment: Kathryn Bernardo, Daniel Padilla confirm breakup\n"
					+ "3. Business: MRT-3 fare hike to be implemented in 2024: DOTr\n";
        	NewsAgency newsAgency = new NewsAgency ();
			newsAgency.setNews(news);
			newsAgency.setSubscriberList(subscriberList);
			
        	System.out.println("Stay Informed with Our Latest News Update!");
            System.out.print("Enter subscriber name: ");
            String subscriberName = scanner.nextLine();
            Subscriber existingSubscriber = findName(subscriberList, subscriberName);
       
            if (existingSubscriber != null) {
                System.out.println(newsAgency.notifySubscriber(subscriberName));
                System.out.print("What would you like to do next? (unsubscribe/logout): ");
                String action = scanner.nextLine().toLowerCase();

                if (action.equals("unsubscribe")) {
                	subscriberList.remove(existingSubscriber);
                    System.out.println("You've unsubscribed. We're sorry to see you go, " + subscriberName + ".\n");
                } else if (action.equals("logout")) {
                	System.out.println();
                    continue;
                } else {
                    System.out.println("Invalid action. Nevertheless, this will logout you from your account.\n");
                }
            } else {
                System.out.print("\nName not found. Do you want to subscribe, " + subscriberName + "? (yes/no): ");
                String subscribeChoice = scanner.nextLine().toLowerCase();

                if (subscribeChoice.equals("yes")) {
                	Subscriber newSubscriber = new Subscriber();
                    newSubscriber.setSubscriberName(subscriberName);
                    subscriberList.add(newSubscriber);
                    System.out.println("Thank you for subscribing, " + subscriberName + ".");
                    System.out.println();
                } else {
                    System.out.println("Thank you for stopping by, " + subscriberName + ".");
                    System.out.println();
                }
            }
        }
    }
	
    private static Subscriber findName(List<Subscriber> subscriberList, String subscriberName) {
        for (Subscriber subscriber : subscriberList) {
            if (subscriber.getSubscriberName().equalsIgnoreCase(subscriberName)) {
                return subscriber;
            }
        }
        return null;
    }
}// Main
