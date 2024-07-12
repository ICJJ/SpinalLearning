package DemoBlackBox

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

class MyBlackBox extends BlackBox{
  val io = new Bundle{
    val a = in Bool()
    val b = in Bool()
  }

  noIoPrefix()
}

class DSP(aa:Int,bb:Int) extends BlackBox{
  val io = new Bundle{
    val a = in Bool()
    val b = in Bool()
    val p = out Bool()
    val clk = in Bool()
    val rst = in Bool()
  }
  noIoPrefix()

  mapClockDomain(clock = io.clk,reset = io.rst)

  addGeneric("p1",aa)
  addGenerics(("p2",bb))

  val a = addRTLPath("./src/main/scala/DemoBlackBox/DSP.V")
  println(a)

  setInlineVerilog(
    """
      |module DSP(
      |    input a,
      |    inout b,
      |    output p
      |);
      |
      |    assign p = a ^ b;
      |endmodule
      |
      |""".stripMargin)
}
class DemoBlackBox extends Component {

  val io = new Bundle {
    val a = in Bool()
    val b = in Bool()
    val p = out Bool()
  }

  noIoPrefix()

  val myBlackBox = new DSP(5,10)
  myBlackBox.io.a <> io.a
  myBlackBox.io.b <> io.b
  myBlackBox.io.p <> io.p

}
