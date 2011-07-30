package org.test

class TriggerService {

    def ruleService
    
    def executeRules() {

        println "in executeRules"
        def result = []
        
        // Find all rule methods
        def rules = ruleService.metaClass.methods.findAll { it.name.endsWith('Rule') }
        
        rules.each { rule ->
            println "rule: ${rule}" 
            // The line below will fail with Grails 2.0.0-M1 with a 
            // java.lang.IllegalStateException:
            // Subtype (org.test.RuleService$$EnhancerByCGLIB$$cb9337f2) 
            // of reloadable type org.test.RuleService is not reloadable
            result << rule.doMethodInvoke(ruleService, "test parameter")
        }
    
        println "rules: ${result}"
    }

    def doNothing() {
        
    }
}
