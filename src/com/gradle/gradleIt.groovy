#!/usr/bin/groovy
package com.gradle


def test (testDir) {
	echo "INF: Starting Test Process"
	echo "INF: Current Path (" + pwd() +")"
	dir ( testDir ) {
		echo "INF: New Current Path (" + pwd() +")"
		bat "./gradlew.bat clean"
		bat "./gradlew.bat test"
	}
	echo "INF: Finished Test Process"

}	
return this