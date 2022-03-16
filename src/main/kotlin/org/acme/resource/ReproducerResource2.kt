package org.acme.resource

import io.quarkus.arc.All
import io.smallrye.mutiny.Uni
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/")
class ReproducerResource2(
    @All private val healthyFoodProviders: List<HealthyFoodProvider>
) {
    @GET
    @Path("using-all")
    @Produces(MediaType.APPLICATION_JSON)
    fun get(): Uni<ResponseDTO> {
        return Uni.createFrom().item(ResponseDTO(healthyFoodProviders.map { it.provide() }))
    }
}