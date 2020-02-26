package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to create topic on the broker

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	private String topicToBeDeleted;

    public DeleteTopicMsg(String user, String topicToBeDeleted) {
        super(MessageType.DELETETOPIC, user);
        this.topicToBeDeleted = topicToBeDeleted;
    }

    public String getTopicToBeDeleted() {
        return topicToBeDeleted;
    }

    public void setTopicToBeDeleted(String topicToBeDeleted) {
        this.topicToBeDeleted = topicToBeDeleted;
    }

    @Override
    public String toString() {
        return super.toString() + " topic to delete: " + this.topicToBeDeleted;
    }

}
