package org.test

import spock.lang.*

/**
 *
 */
class PersonServiceITSpec extends Specification {

	PersonService personService
    def setup() {
    }

    def cleanup() {
    }

    void "test createPerson happy path"() {
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
