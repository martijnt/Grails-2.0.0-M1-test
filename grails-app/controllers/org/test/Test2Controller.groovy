package org.test

class Test2Controller {

	// specifying the method without type will cause a classcast exception:
	// org.test.TriggerService$$EnhancerByCGLIB$$9b438738 cannot be cast to groovy.lang.Closure
	def triggerService 
	
    def index() { 
		triggerService.executeRules()
		render "OK"	
	}
}
