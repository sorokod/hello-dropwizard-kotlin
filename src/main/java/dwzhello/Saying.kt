package dwzhello

import com.fasterxml.jackson.annotation.JsonProperty

class Saying(@JsonProperty val id: Long, @JsonProperty val content: String)
