package demo;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;

@Component
public class ExamineServers {

	 @Autowired LoadBalancerClient loadBalancer;
	
	public URI getAClientUri() {
		ServiceInstance instance = loadBalancer.choose("searchEngines");
		return instance.getUri();
	}
}
