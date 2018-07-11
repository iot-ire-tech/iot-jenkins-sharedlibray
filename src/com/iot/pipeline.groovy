#!/usr/bin/groovy
package com.iot

/**
 *
 * @author ae
 */
def build() {
	//  mvn clean deploy -U
	try {
		println "Building code  "
		error 
	} catch (Exception e) {
		println "ERR: Building ...."
	}
}

def test(name) {
	sh "echo ${name}"
}

def deploy(env,app) {
	println "Deploying to ${env}_${app} "
}

// AimTheory have a recommendation and explanation about this here
return this
