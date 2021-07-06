package j2eeTypePatterns.ServiceLocatorPattern;

public class ServiceLocator {
	
	private static Cache cache;
	
	static {
		cache = new Cache();
	}
	
	public static Service getService(String jndiName) {
		Service service = cache.getService(jndiName);
		if(service!=null) {
			return service;
		}
		InitialContext context = new InitialContext();
		Service service1=(Service) context.lookUp(jndiName);
		cache.addService(service1);
		return service1;
	}

}
