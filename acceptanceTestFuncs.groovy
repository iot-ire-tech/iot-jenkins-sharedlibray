/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

def name='aennis'

println "Hello $name!"

def cliList (sut, env, mode) {
	echo "INF: Service Under Test: ("+sut+")"
	echo "INF: Target Env: ("+env+")"
	echo "INF: Target Mode: ("+mode+")"
	
}