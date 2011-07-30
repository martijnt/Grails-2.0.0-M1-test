package org.test

class TestController {

	TriggerService triggerService 
	
    def index() { 
		triggerService.executeRules()
		render "OK"	
	}
}
