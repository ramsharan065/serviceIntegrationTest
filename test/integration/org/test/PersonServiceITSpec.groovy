package org.test



//import grails.test.mixin.TestFor;
//import grails.test.mixin.TestMixin;
//import grails.test.mixin.integration.IntegrationTestMixin;
//import grails.test.spock.IntegrationSpec;

import spock.lang.*

/**
 *
 */
class PersonServiceITSpec extends Specification {

	PersonService personService
    def setup() {
    	//PersonService personService = new PersonService()
    }

    def cleanup() {
    }

    void "test something"() {
    	given:
    	final String name = 'name'

    	when:
    	def result = personService.createPerson(name)

    	then:
    	result != null
    	name == result.name
    	result.id != null
    }
}
