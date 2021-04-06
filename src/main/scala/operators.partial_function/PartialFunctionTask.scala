package operators.partial_function


object PartialFunctionTask extends App {

  def discount: PartialFunction[Jar, String] = {
    case Jar(name, value, price) if value > 10 => s"$name ${price * 0.1}"
    case Jar(name, value, price) if value >= 5 => s"$name ${price * 0.05}"
  }

}
