package org.acme.resource

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class FoodProvider : HealthyFoodProvider {

    override fun provide(): String {
        return "fruits"
    }
}