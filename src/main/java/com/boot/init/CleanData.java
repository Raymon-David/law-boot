
package com.boot.init;

import org.activiti.engine.ProcessEngineConfiguration;

public class CleanData {
	
	public static void main(String[] args) {
		ProcessEngineConfiguration config = ProcessEngineConfiguration.createProcessEngineConfigurationFromResourceDefault();
		config.setDatabaseSchemaUpdate("drop-create");
		config.buildProcessEngine();
		
		config.buildProcessEngine().close();
	}
	
}
