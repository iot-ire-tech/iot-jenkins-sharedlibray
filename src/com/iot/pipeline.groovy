#!/usr/bin/groovy
package com.iot

/**
 *
 * @author ae
 */
def build() {
  mvn clean deploy -U
}

def test(name) {
  sh "/usr/local/bin/${name}"
}

def deploy(env,app) {
  println "Deploying to ${env}_{app} "
}

// AimTheory have a recommendation and explanation about this here
return this
