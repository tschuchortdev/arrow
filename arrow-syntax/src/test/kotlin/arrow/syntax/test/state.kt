package arrow.syntax.test

import arrow.core.toT
import arrow.data.State
import arrow.data.run
import arrow.syntax.state.state
import arrow.syntax.state.value
import arrow.test.UnitSpec
import io.kotlintest.KTestJUnitRunner
import io.kotlintest.matchers.shouldBe
import org.junit.runner.RunWith


@RunWith(KTestJUnitRunner::class)
class StateSyntaxTest : UnitSpec() {
    private val addOne = State<Int, Int> { n -> n * 2 toT n }

    init {
        "addOne.run(1).state should return 2" {
            addOne.run(1).state shouldBe 2
        }

        "addOne.run(1).value should return 1" {
            addOne.run(1).value shouldBe 1
        }
    }
}
