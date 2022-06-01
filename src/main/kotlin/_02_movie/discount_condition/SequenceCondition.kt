package _02_movie.discount_condition

import _02_movie.Screening

class SequenceCondition(private val sequence: Int) : DiscountCondition {
    override fun isSatisfiedBy(screening: Screening) = screening.isSequence(sequence)
}
