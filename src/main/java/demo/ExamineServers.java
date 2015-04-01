package demo;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;

@Component
public class ExamineServers {

	 @Autowired LoadBalancerClient loadBalancer;
	
	public void process() {
        
		ServiceInstance instance = loadBalancer.choose("searchEngines");
        
		URI searchEngineUri = instance.getUri();
		
		System.out.println(searchEngineUri);
		
	}
}
