package _02_movie

import _02_movie.discount_condition.PeriodCondition
import _02_movie.discount_condition.SequenceCondition
import _02_movie.discount_policy.AmountDiscountPolicy
import java.time.DayOfWeek
import java.time.Duration
import java.time.LocalTime

fun main() {
    Movie(
        "아바타", Duration.ofMillis(120), Money.wons(10000),
        AmountDiscountPolicy(
            Money.wons(2000),
            SequenceCondition(1),
            SequenceCondition(5),
            PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
            PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(14, 0), LocalTime.of(16, 59)),
        )
    )
}
