package DemoClockDomain

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

class Pll extends  BlackBox {
//class Pll extends  Component {
    val io = new Bundle{
      val clkIn = in Bool()
      val rstIn = in Bool()
      val clkOut = out Bool()
      val rstOut = out Bool()
    }
  noIoPrefix()

    //  io.clockOut := io.clkIn
    //  io.rstOut := True
}

class DemoInternalClockDomain extends Component {
 val io = new Bundle{
    val clk =in Bool()
    val rst = in Bool()
    val ret = out UInt(4 bits)
  }
  noIoPrefix()

  val clkDomain = ClockDomain.internal("int")

  val pll = new Pll()
  pll.io.clkIn := io.clk
  pll.io.rstIn := io.rst

  clkDomain.clock := pll.io.clkOut
  clkDomain.reset := pll.io.rstOut

  val clkArea = new ClockingArea(clkDomain){
    val b0 = Reg(UInt(4 bits)) init(7)
    b0 := b0 + 1
    io.ret := b0
  }
}
