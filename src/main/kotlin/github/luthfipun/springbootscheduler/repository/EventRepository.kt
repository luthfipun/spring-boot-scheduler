package github.luthfipun.springbootscheduler.repository

import github.luthfipun.springbootscheduler.domain.entity.Event
import org.springframework.data.jpa.repository.JpaRepository

interface EventRepository: JpaRepository<Event, Long>