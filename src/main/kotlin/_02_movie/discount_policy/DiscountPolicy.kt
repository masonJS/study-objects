package _02_movie.discount_policy

import _02_movie.Money
import _02_movie.Screening
import _02_movie.discount_condition.DiscountCondition

abstract class DiscountPolicy(vararg discountCondition: DiscountCondition) {
    private var conditions = emptyList<DiscountCondition>()

    init {
        conditions = discountCondition.toMutableList()
    }

    fun calculateDiscountAmount(screening: Screening): Money {
        for (each in conditions) {
            if (each.isSatisfiedBy(screening)) {
                return discountAmount(screening)
            }
        }
        return Money.ZERO
    }

    protected abstract fun discountAmount(screening: Screening): Money
}
