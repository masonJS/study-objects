package _02_movie.discount_policy

import _02_movie.Money
import _02_movie.Screening
import _02_movie.discount_condition.DiscountCondition

class PercentDiscountPolicy(private val percent: Double, vararg conditions: DiscountCondition) :
    DiscountPolicy(*conditions) {
    override fun discountAmount(screening: Screening): Money {
        TODO("Not yet implemented")
    }
}
