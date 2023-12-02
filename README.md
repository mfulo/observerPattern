## Problem Statement

<p align=center>Real-time News Subscription Service</p>

Background: <br>
You're tasked with designing a real-time news subscription service for a media company. The system needs to notify subscribers about breaking news as soon as it's published by the news agency. <br>

<br>
Requirements: <br>
> Subscription Management: Users should be able to subscribe to the news service. Subscribers should be notified promptly when new news is published. <br>
> Dynamic Subscription Updates: The system should allow for dynamic subscription updates. Subscribers can subscribe, unsubscribe, or modify their preferences without disrupting other subscribers. <br>
> Decoupled Communication: Ensure that the communication between the news agency and subscribers is decoupled. Subscribers shouldn't directly request news updates but should be notified by the news agency when new information is available. <br>

<br>
Expected Behavior: <br>
> When the news agency publishes breaking news, all subscribed users should receive immediate updates.<br>
> Subscribers can join or leave the service without affecting the delivery of news to other subscribers.<br>
> The system should provide flexibility for future enhancements, such as personalized subscriptions or categorization of news updates.<br>

<br>
Constraints:<br>
> The system should be scalable to handle a growing number of subscribers without compromising performance.<br>
> Ensure that the implementation follows object-oriented design principles and promotes loose coupling between the news agency and subscribers.

## Class Definitions
\> Main: The client class that uses Subject to notify updates to its Observers. <br>
\> NewsSubject: Interface implemented by NewsAgency.<br>
\> NewsAgency: Represents the central hub for publishing news. It maintains a list of subscribers and notifies them whenever new news is available.<br>
\> Subscriber: Represents users or entities subscribed to the news service. Subscribers receive immediate notifications about any breaking news published by the agency.<br>
\> SubscriberObserver: Interface implemented by Subscriber.<br>
 
 ## UML Diagram
 ![UML](https://github.com/mfulo/observerPattern/assets/142382665/41d678b1-a4bc-4272-bdda-39bd62551637)

 ## Sample Console Output
 ![1](https://github.com/mfulo/observerPattern/assets/142382665/62692f76-2b54-41c5-bfda-423f26b1ac34)
 ![2](https://github.com/mfulo/observerPattern/assets/142382665/684bc7e6-df79-4216-827a-56b1f42e8179)


