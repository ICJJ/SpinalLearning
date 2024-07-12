package DemoBundle

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

class ColorA extends Bundle {
  val r = UInt(8 bits)
  val g = UInt(8 bits)
  val b = UInt(8 bits)
}

class ColorB extends Bundle with IMasterSlave {
  val r = UInt(8 bits)
  val g = UInt(8 bits)
  val b = UInt(8 bits)

  override def asMaster(): Unit = {
    out(r)
    out(g)
    out(b)
  }
}

class ColorC extends Bundle {
  val r = UInt(8 bits)
  val g = UInt(8 bits)
  val b = UInt(8 bits)
}


class DemoBundle extends Component {

  val colorA = new ColorA
  val a0 = UInt(8 bits)
  a0 := colorA.r


  val b0 = master(new ColorB)
  val b1 = slave(new ColorB)
  b0 := b1

  val c0 = new ColorC
  c0.assignFromBits(B"24'h5")

}
