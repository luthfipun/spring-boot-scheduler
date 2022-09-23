package github.luthfipun.springbootscheduler.service

import github.luthfipun.springbootscheduler.domain.entity.Event
import github.luthfipun.springbootscheduler.domain.model.EventResponse
import github.luthfipun.springbootscheduler.domain.model.WebResponse
import github.luthfipun.springbootscheduler.repository.EventRepository
import github.luthfipun.springbootscheduler.util.log
import github.luthfipun.springbootscheduler.util.time
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

@Service
@EnableScheduling
class EventServiceImpl(
    val eventRepository: EventRepository
): EventService {
    @Scheduled(fixedRate = 5000)
    fun addNewEvent(){
        val newEvent = "Event on ${time()}"
        val event = Event(name = newEvent)
        eventRepository.save(event)

        log(message = "Created $newEvent")
    }

    @Scheduled(cron = "1 * * * * ?")
    fun clearEvent(){
        eventRepository.deleteAll()
        log(message = "Clear Event | ${time()}")
    }

    override fun getData(): WebResponse<List<EventResponse>> {
        return WebResponse(data = eventRepository.findAll().map { it.toEventResponse() })
    }
}