
public class Message {
	private Person sender,reciver;
	private String message;
	
	
	public Message(Person sender, Person reciver, String message) {
		super();
		this.sender = sender;
		this.reciver = reciver;
		this.message = message;
	}

	public Person getSender() {
		return sender;
	}

	public void setSender(Person sender) {
		this.sender = sender;
	}

	public Person getReciver() {
		return reciver;
	}

	public void setReciver(Person reciver) {
		this.reciver = reciver;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
}
