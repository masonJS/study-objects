package _02_movie.discount_condition

import _02_movie.Screening

interface DiscountCondition {
    fun isSatisfiedBy(screening: Screening): Boolean
}
