import java.util.*;

public class ProviderManager {

	HashMap<Object, Provider> providers = new HashMap<Object, Provider>();

	private volatile static ProviderManager manager;

	private ProviderManager() {
	}

	public static ProviderManager getManager() {
		if (manager == null) {
			synchronized (ProviderManager.class) {
				if ( manager == null) {
					manager = new ProviderManager();
				}
			}
		}
		return manager;
	}

	public Provider getProvider(Object client) {
		if (providers.size() < 3) {
			providers.put(client, new Provider());
			return providers.get(client);
		}
		return null;
	}

	public int numProvidersAvailable() {
		return (3 - providers.size());
	}
}
