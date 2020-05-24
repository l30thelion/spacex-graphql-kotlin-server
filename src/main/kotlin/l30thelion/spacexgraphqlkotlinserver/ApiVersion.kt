package l30thelion.spacexgraphqlkotlinserver

import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class ApiVersion: Query {
    fun apiVersion(): String = "1.0.0"
}