import java.util.HashMap;
import java.util.Map;

public class CacheManager {
	private static volatile CacheManager cacheManager;
	private static volatile Map<Object,Object> cache;
	
	private CacheManager() {
		if (cacheManager != null) {
			throw new RuntimeException("Please use casheManager method.");
		}
	}
	
	public static CacheManager getCacheManager() {
		if(cacheManager == null) {
			synchronized (CacheManager.class) {
				if(cacheManager == null) {
					cacheManager = new CacheManager();
				}
			}
		}
		return cacheManager;
	}
	
	public Map<Object, Object> getCache(){
		if(cache == null) {
			synchronized (CacheManager.class) {
				if(cache == null) {
					cache = new HashMap<Object, Object>();
				}
			}
		}
		return cache;
	}
}