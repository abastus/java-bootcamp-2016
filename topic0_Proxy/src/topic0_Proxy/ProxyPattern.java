package topic0_Proxy;

public class ProxyPattern {
	
	Client request = null;
	
	public void Connect() {
		if (request == null) {
			request = new Client();
			}
		request.Connect();
	}
	
}
