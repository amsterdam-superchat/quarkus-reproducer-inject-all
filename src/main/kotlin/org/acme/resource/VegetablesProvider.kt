package org.acme.resource

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class VegetablesProvider : HealthyFoodProvider {

    override fun provide(): String {
        return "vegetables"
    }
}