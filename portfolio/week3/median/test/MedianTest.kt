// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median_calc(listOf())
        }
    }

    // Write four more tests here
    "Works as expected when size=1" {
        median_calc(listOf(1f)) shouldBe 1
    }
    "Works as expected when size=2" {
        median_calc(listOf(2f,4f)) shouldBe 3
    }
    "Works as expected when size=3" {
        median_calc(listOf(1f,43f,122f)) shouldBe 43
    }
    "Works as expected when size=4" {
        median_calc(listOf(1f,6f,10f,50f)) shouldBe 8
    }
})
