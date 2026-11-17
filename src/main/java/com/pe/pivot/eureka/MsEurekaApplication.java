package com.pe.pivot.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Main entry point for the Netflix Eureka Discovery Server (pivot-ms-eureka :8761).
 */
@EnableEurekaServer
@SpringBootApplication
public class MsEurekaApplication {

  /**
   * Starts the Eureka discovery server.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(MsEurekaApplication.class, args);
  }
}
