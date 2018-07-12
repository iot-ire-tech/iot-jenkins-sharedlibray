/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

creds = "ssh_devopspipeline_credentials";
creds = "devopspipeline"
serviceToTest ="https://github.aig.net/commercial-it-global-delivery/ael-policy-autobooker-test-automation-5416.git";
targetDir = "myAcceptanceTests"

def checkOutTestAutomation () {
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