package dwzhello

import com.fasterxml.jackson.annotation.JsonProperty
import io.dropwizard.Configuration
import org.hibernate.validator.constraints.NotEmpty

class HelloWorldConfiguration : Configuration() {

    @NotEmpty
    @JsonProperty
    lateinit var template: String

    @NotEmpty
    @JsonProperty
    var defaultName = "Stranger"
}