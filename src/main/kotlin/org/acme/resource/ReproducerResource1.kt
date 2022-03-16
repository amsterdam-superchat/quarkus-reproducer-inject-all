package org.acme.resource

import io.smallrye.mutiny.Uni
import javax.enterprise.inject.Instance
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/")
class ReproducerResource1(
    private val healthyFoodProviders: Instance<HealthyFoodProvider>
) {
    @GET
    @Path("using-instance")
    @Produces(MediaType.APPLICATION_JSON)
    fun get(): Uni<ResponseDTO> {
        return Uni.createFrom().item(ResponseDTO(healthyFoodProviders.map { it.provide() }))
    }
}