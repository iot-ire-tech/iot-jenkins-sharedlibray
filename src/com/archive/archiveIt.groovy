#!/usr/bin/groovy
package com.archive

def archive (dirs) {
	echo "INF: Starting Archive Process"
	try {
		archiveArtifacts "$dirs" 
	} catch(Exception e) { 
		echo "WRN: Couldnt Archive Test Results"
		currentBuild.result = 'UNSTABLE'
	}
	echo "INF: Finished Archive Process"
}	
def zip (dirs) {
	echo "INF: Starting Zip Process"
	archiveArtifacts "$dirs" 
	echo "INF: Finished Zip Process"
}	
return this
return this