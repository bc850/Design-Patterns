
public class Provider {
	
	ProviderManager manager = ProviderManager.getManager();
	
	public void service(Object client, Foo foo) {
		if(manager.providers.get(client).equals(this)) {
			foo.increment();
		}
	}

	public void release(Object client) {
		if(manager.providers.containsKey(client)) {
			manager.providers.remove(client);
		}
	}
}
