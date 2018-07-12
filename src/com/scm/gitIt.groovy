#!/usr/bin/groovy
package com.scm


def checkOutTestAutomation (serviceRef, targetDir) {
	creds = "ssh_devopspipeline_credentials";
	creds = "devopspipeline"

	checkout(
		[$class: 'GitSCM', 
			branches: [[name: '*/master']], 
			doGenerateSubmoduleConfigurations: false, 
			extensions: [
				[$class: 'LocalBranch'], 
				[$class: 'RelativeTargetDirectory', relativeTargetDir: targetDir]
			], 
			gitTool: 'Default', submoduleCfg: [], 
			userRemoteConfigs: [[credentialsId: creds, url: serviceRef]]
		])
}	
return this