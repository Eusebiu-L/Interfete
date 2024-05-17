
public class Person {
	private String nume;
	private Transmitter transmitter;
	public Person(String nume) {
		super();
		this.nume = nume;
		this.transmitter = null;
	}
	
	public Transmitter getTransmitter() {
		return transmitter;
	}
	public void setTransmitter(Transmitter transmitter) {
		this.transmitter = transmitter;
	}
	public String getNume() {
		return nume;
	}
	public void send(Person p,String s) {
		Message m = new Message(this,p,s);
		transmitter.store(m);
	}
}
