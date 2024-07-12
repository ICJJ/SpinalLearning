package DemoBits

import spinal.core._
import spinal.lib._
import scala.language.postfixOps


/** Bits type not for math */
class DemoBits extends Component {

  /** define and assign */
  val a0 = Bits(8 bits)
  a0 := 254
  val a1 = Reg(Bits(8 bits)) init( B"8'h0")
  val a2 = B"8'd255"
  val a3 = B(255,8 bits)

  val b0 = B(8 bits, 7-> true, default -> false)
  val b1 = B(8 bits, (7 downto 4)->B"4'd5", default -> false)

  val c0 = B"8'd255"
  val c1 = c0(5)
  val c2 = c0(5 downto 2)
  val c3 = c0(2 until 6)
  val c4 = c0(2 to 5)
  val c5 = B"8'b0"
  c5(3 downto 0) := B"4'd7"
  c5(1 to 2) := B"2'd2"
  c5(3 until 5) := B"2'd3"

  /** calculate */

  val d0 = B"8'b1001_0110"
  val d1= B"8'b0001_1111"
  val d2 = d0 & d1
  val d3 = d0 | d1
  val d4 = d0 ^ d1
  val d5 = ~d0
  /** d6 = d0[0] | d0[1] ... | d0[7]
   *
   * whether d0 is 0 per bit*/
  val d6 = d0.orR
  /** d7 = d0[0] `&` d0[1] ... `&` d0[7]
   *
   * whether d0 is 1 per bit */
  val d7 = d0.andR

  /** d8 = d0[0] `^` d0[1] ... `^` d0[7]
   *
   * whether equal between per bit */
  val d8 = d0.xorR

  val d9 = d0.orR && d1.orR

  /** shift with int and uint */
  val e0 = B"8'hff"
  val e1 = e0 >> 2
  val e2 = e0 >> U(2)
  val e3 = e0 << 2
  val e4 = e0 << U(2)

  val e5 = e0 |>> 2
  val e6 = e0 |>> U(2)
  val e7 = e0 |<< 2
  val e8 = e0 |<< U(2)

  val e9 = e0 rotateLeft 2
  val e10 = e0 rotateLeft U(2)
  val e11 = e0 rotateRight  2
  val e12 = e0 rotateRight  U(2)

  val setClear = Bool()
  val f0 = B"8'b1101_1010"
  when(setClear){
    f0.setAll()
  } otherwise  {
    f0.clearAll()
  }

}
