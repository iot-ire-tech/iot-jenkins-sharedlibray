#!/usr/bin/groovy
package com.gradle


def checkOutTestAutomation () {
	creds = "ssh_devopspipeline_credentials";
	creds = "devopspipeline"
	serviceToTest ="https://github.aig.net/commercial-it-global-delivery/ael-policy-autobooker-test-automation-5416.git";
	targetDir = "myAcceptanceTests"

	checkout(
		[$class: 'GitSCM', 
			branches: [[name: '*/master']], 
			doGenerateSubmoduleConfigurations: false, 
			extensions: [
				[$class: 'LocalBranch'], 
				[$class: 'RelativeTargetDirectory', relativeTargetDir: targetDir]
			], 
			gitTool: 'Default', submoduleCfg: [], 
			userRemoteConfigs: [[credentialsId: creds, url: serviceToTest]]
		])
}	
return this