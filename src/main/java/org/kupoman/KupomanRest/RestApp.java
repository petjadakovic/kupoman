package org.kupoman.KupomanRest;

import javax.ws.rs.ApplicationPath;

import org.kupoman.KupomanRest.filters.CorsFilter;
import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("/rest")
public class RestApp extends ResourceConfig{

	public RestApp() {
		packages("org.kupoman.KupomanRest");
		register(CorsFilter.class);
	}
	
}
