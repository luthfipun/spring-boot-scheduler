package github.luthfipun.springbootscheduler.domain.model

import java.util.Date

data class EventResponse(
    val id: Long,
    val name: String,
    val createdAt: Date
)
