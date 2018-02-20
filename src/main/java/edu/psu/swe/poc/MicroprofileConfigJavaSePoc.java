package edu.psu.swe.poc;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.weld.environment.se.events.ContainerInitialized;

public class MicroprofileConfigJavaSePoc {

  @Inject
  @ConfigProperty(name = "java.property")
  String javaProperty;

  @Inject
  @ConfigProperty(name = "ENVIRONMENT_VARIABLE")
  String environmentVariable;
  
  public void start(@Observes ContainerInitialized containerInitializedEvent) {
    System.out.println("MicroprofileConfigJavaSePoc\n");
    System.out.println("ENVIRONMENT_VARIABLE: " + environmentVariable);
    System.out.println("java.property: " + javaProperty);
  }

}
