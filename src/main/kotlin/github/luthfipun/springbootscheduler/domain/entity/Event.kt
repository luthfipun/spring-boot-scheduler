package github.luthfipun.springbootscheduler.domain.entity

import github.luthfipun.springbootscheduler.domain.model.EventResponse
import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "event")
data class Event(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,

    @Column(name = "name")
    val name: String,

    @Column(name = "created_at")
    val createdAt: Date = Date()
){
    fun toEventResponse(): EventResponse {
        return EventResponse(
            id = this.id,
            name = this.name,
            createdAt = this.createdAt
        )
    }
}
