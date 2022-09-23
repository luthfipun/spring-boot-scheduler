package github.luthfipun.springbootscheduler.controller

import github.luthfipun.springbootscheduler.domain.model.EventResponse
import github.luthfipun.springbootscheduler.domain.model.WebResponse
import github.luthfipun.springbootscheduler.service.EventService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EventController(
    val eventService: EventService
) {
    @GetMapping(
        value = ["/"],
        produces = ["application/json"]
    )
    fun getData(): WebResponse<List<EventResponse>> {
        return eventService.getData()
    }
}