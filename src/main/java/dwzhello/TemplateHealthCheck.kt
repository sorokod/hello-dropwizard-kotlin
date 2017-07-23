package dwzhello

import com.codahale.metrics.health.HealthCheck

class TemplateHealthCheck(val template: String) : HealthCheck() {


    override fun check(): Result {
        val saying = String.format(template, "TEST")

        return when (saying.contains("TEST")) {
            false -> Result.unhealthy("template doesn't include a name")
            true -> Result.healthy("All good")
        }
    }
}