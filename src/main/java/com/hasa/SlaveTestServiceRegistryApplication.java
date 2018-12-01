package com.hasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * - SlaveTestService -
 * @author Hasantha Alahakoon 
 */
@SpringBootApplication
@EnableEurekaServer
public class SlaveTestServiceRegistryApplication
{
  public static void main(String[] args)
  {
    SpringApplication.run(SlaveTestServiceRegistryApplication.class, args);
  }
}
