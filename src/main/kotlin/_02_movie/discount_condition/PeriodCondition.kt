package _02_movie.discount_condition

import _02_movie.Screening
import java.time.DayOfWeek
import java.time.LocalTime

class PeriodCondition(
    private val dayOfWeek: DayOfWeek,
    private val startTime: LocalTime,
    private val endTime: LocalTime
) : DiscountCondition {
    override fun isSatisfiedBy(screening: Screening): Boolean = screening.startTime().dayOfWeek.equals(dayOfWeek) &&
        startTime <= screening.startTime().toLocalTime() &&
        screening.startTime().toLocalTime() <= endTime
}
