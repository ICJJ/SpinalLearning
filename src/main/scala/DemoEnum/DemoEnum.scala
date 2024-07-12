package DemoEnum

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

object  enum extends SpinalEnum(defaultEncoding = binaryOneHot) {
  val a,b,c = newElement
}

class DemoEnum extends Component {
  val enumList = Reg(enum) init enum.a
}
