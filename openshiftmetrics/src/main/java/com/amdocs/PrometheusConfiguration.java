package com.amdocs;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;

import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.hotspot.MemoryPoolsExports;
import io.prometheus.client.hotspot.StandardExports;
import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
@Configuration
@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
public class PrometheusConfiguration {
	
	@PostConstruct
	  public void registerPrometheusCollectors() {
	    CollectorRegistry.defaultRegistry.clear();
	    new StandardExports().register();
	    new MemoryPoolsExports().register();
	
	  }

}
