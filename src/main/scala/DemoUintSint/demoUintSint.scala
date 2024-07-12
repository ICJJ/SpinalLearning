package DemoUintSint

import spinal.core._
import spinal.core.sim.SimDataPimper
import spinal.lib._

import scala.language.postfixOps
import spinal.lib.dsptool._

class DemoUintSint extends Component {

  /** define */
  val a0 = UInt(10 bits)
  val a1 = SInt(10 bits)
  val a2 = U(8,10 bits)
  val a3 = S(8,10 bits)
  val a4 = U(7)
  val a5 = S(7)
  val a6 = U"3'd6"
  val a7 = S"3'd7"

  /** calculate */
  val b0 = UInt(8 bits)
  val b1 = UInt(8 bits)

  val b2 = b0 + b1
  val b3 = b0 - b1
  /** '+^'防止溢出 */
  val b4 = b0 +^ b1
  val b5 = b0 +| b1
  val b6 = b0 * b1
  val b7 = b0.subdivideIn(4 bits)
  val b8 = b0.subdivideIn(4 bits).reduce(_+_)

  val c0 = SInt(8 bits)
  val c1 = SInt(8 bits)

  val c2 = c0 + c1
  val c3 = c0 - c1
  /** '+^'防止溢出 */
  val c4 = c0 +^ c1
  val c5 = c0 +| c1
  val c6 = c0 * c1
  val c7 = c0.subdivideIn(2 slices).reduce(_+_)

  /** fix point */
  val d0 = UInt(16 bits)
  val d1 = d0.fixTo(8 downto 3,RoundType.ROUNDUP)

  val d2 = UInt(16 bits)
  val d3 = UInt(16 bits)
  d2 := U(Integer.parseInt(FixData(3.1, UQ(16,8)).hex,16))
  d3 := U(Integer.parseInt(FixData(3.2, UQ(16,8)).hex,16))

  val d4 = d2 * d3 simPublic()
  val d5 = d4.fixTo(23 downto 8) simPublic()

}
