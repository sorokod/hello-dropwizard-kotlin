package dwzhello

import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class HelloWorldApplication : Application<HelloWorldConfiguration>() {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            HelloWorldApplication().run(*args)
        }
    }


    override fun getName() = "hello-world"


    override fun initialize(bootstrap: Bootstrap<HelloWorldConfiguration>) { // nothing to do yet
    }


    override fun run(configuration: HelloWorldConfiguration, environment: Environment) {

        with(environment) {

            jersey().register(HelloWorldResource(
                    configuration.template,
                    configuration.defaultName)
            )

            healthChecks().register("template", TemplateHealthCheck(configuration.template))
        }
    }
}