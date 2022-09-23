package github.luthfipun.springbootscheduler.service

import github.luthfipun.springbootscheduler.domain.model.EventResponse
import github.luthfipun.springbootscheduler.domain.model.WebResponse

interface EventService {
    fun getData(): WebResponse<List<EventResponse>>
}