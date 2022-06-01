package _02_movie

import _02_movie.discount_policy.DiscountPolicy
import java.time.Duration

class Movie(
    private val title: String,
    private val runningTime: Duration,
    val fee: Money,
    private val discountPolicy: DiscountPolicy
) {
    fun calculateMovieFee(screening: Screening) = fee.minus(discountPolicy.calculateDiscountAmount(screening))
}
