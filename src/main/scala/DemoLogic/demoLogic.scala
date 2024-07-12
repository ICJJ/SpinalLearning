package DemoLogic

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

class DemoLogic extends Component {
  val a = Bool()
  val b = Reg(Bool())

  a := True
  b := False

  val c = RegInit(False)
  c := True

  val cc = Reg(Bool()) init(False)
  cc := True

  val d = RegNext(b)

  val e = RegNextWhen(b,a)
}
