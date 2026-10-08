// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class GradeTest : FreeSpec({
    "Negative grades should return ?" {
        assertSoftly {
            withClue("grade(-1)") {
                grade(-1) shouldBe "?"
            }
            withClue("grade(-46)") {
                grade(-46) shouldBe "?"
            }
        }
    }

    "Grades from 0 to 39 should return Fail" {
        assertSoftly {
            withClue("grade(0)") {
                grade(0) shouldBe "Fail"
            }
            withClue("grade(22)") {
                grade(22) shouldBe "Fail"
            }
            withClue("grade(39)") {
                grade(39) shouldBe "Fail"
            }
        }
    }

    "Grades from 40 to 69 should return Pass" {
        assertSoftly {
            withClue("grade(40)") {
                grade(40) shouldBe "Pass"
            }
            withClue("grade(55)") {
                grade(55) shouldBe "Pass"
            }
            withClue("grade(69)") {
                grade(69) shouldBe "Pass"
            }
        }
    }

    "Grades from 70 to 100 should return Distinction" {
        assertSoftly {
            withClue("grade(70)") {
                grade(70) shouldBe "Distinction"
            }
            withClue("grade(88)") {
                grade(88) shouldBe "Distinction"
            }
            withClue("grade(100)") {
                grade(100) shouldBe "Distinction"
            }
        }
    }

    "Grades above 100 should return ?" {
        assertSoftly {
            withClue("grade(101)") {
                grade(101) shouldBe "?"
            }
            withClue("grade(153)") {
                grade(153) shouldBe "?"
            }
        }
    }
})