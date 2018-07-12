#!/usr/bin/groovy
package com.reports


def test (testDir) {
	echo "INF: Starting Reporting Process"
	cucumber fileIncludePattern: '**/*.json', sortingMethod: 'ALPHABETICAL'
	echo "INF: Finished Reporting Process"

}	
return this