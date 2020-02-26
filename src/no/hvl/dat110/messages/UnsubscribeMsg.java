package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	private String unsubTo;

    public UnsubscribeMsg(String user, String unsubTo) {
        super(MessageType.UNSUBSCRIBE, user);
        this.unsubTo = unsubTo;
    }

    public String getUnsubTo() {
        return unsubTo;
    }

    public void setUnsubTo(String unsubTo) {
        this.unsubTo = unsubTo;
    }

    @Override
    public String toString() {
        return super.toString() + " unsubscribe to: "  + this.unsubTo;
    }
}
