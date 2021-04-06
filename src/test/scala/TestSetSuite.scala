
import operators.partial_function.Jar
import operators.partial_function.PartialFunctionTask.discount
import org.junit.Assert._
import org.junit._

class TestSetSuite {

  trait TestSets {
    val jars = List(
      Jar("Blue 6l", 6, 3000.0),
      Jar("Red 12l", 12, 5000.0),
      Jar("Green 1l", 1, 500.0),
    )
  }

  @Test
  def `partionalFunction`: Unit = {
    new TestSets {
      val expected = List("Blue 6l 150.0", "Red 12l 500.0")
      assertTrue(jars.collect(discount).zip(expected).forall { case (x, y) => x.equals(y) })
    }
  }

}
