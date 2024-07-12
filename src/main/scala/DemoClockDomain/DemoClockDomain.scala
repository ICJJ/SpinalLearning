package DemoClockDomain

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

class DemoClockDomain extends Component {

  val a0_io =new Bundle{
    val clk = in Bool()
    val rst = in Bool()
  }

  noIoPrefix()

  val a0_clkCfg = ClockDomainConfig(
    clockEdge = RISING
    ,resetKind = ASYNC
    ,resetActiveLevel = LOW
  )

  val a0_clkDomain = ClockDomain(
    clock = a0_io.clk,
    reset = a0_io.rst,
    config = a0_clkCfg
  )

  val clkArea = new ClockingArea(a0_clkDomain){
    val a0 = in UInt(8 bits)
    val a1 = RegNext(a0) init(0)
  }
    val a0 = in UInt(8 bits)
    val a1 = RegNext(a0) init(0)
}
