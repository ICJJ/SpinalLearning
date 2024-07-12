package DemoVec

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

class DemoVec extends Component {
  /** define */
  val a0 =Vec(UInt(8 bits), 5)
  a0(0) := 0
  a0(1) := 1
  a0(2) := 2

  val a1 =Vec(Reg(UInt(8 bits)), 5)
  for (i <- 0 until 5) {
    a1(i) := i
  }

  val a2 = Vec(UInt(5 bits),UInt(6 bits))

  val a3 = Vec(UInt(5 bits),3)
  a3.foreach(_:=0)

  val a4 = Vec(UInt(5 bits),3)
  a4.map(_ := 0)

  val a5 = Vec(UInt(5 bits),3)
  val a6 = Vec(UInt(5 bits),3)
  val ret = a5 === a6

  /** func */
  val b0 = Vec(UInt(8 bits), 4)
  val b1 = b0.sCount(_ > 5)

  val b2 = b0.sExist(_ < 3)
  val b3 = b0.sFindFirst(_ > 3)_1
  val b4 = b0.sFindFirst(_ > 3)_2
  val b5 = UInt(2 bits)
  val b6 = Bool()
  (b5,b6) := b0.sFindFirst(_ > 3).asBits

  val c0 = Vec(UInt(8 bits),4)
  val c1 = c0.shuffle(index => List(3,0,1,2)(index))
  c1(0) := 0 //c0(3)
  c1(1) := 1 //c0(0)
  c1(2) := 2 //c0(1)
  c1(3) := 3 //c0(2)

  val d0 = Vec(UInt(8 bits),4)
  val d1 = d0.shuffleWithSize((i,j)=>if(j==0) 3 else j -1)
  d1(0) := 0 //d0(3)
  d1(1) := 1 //d0(0)
  d1(2) := 2 //d0(1)
  d1(3) := 3 //d0(2)

  /** reduce */
  val e0 = Vec(UInt(8 bits),4)
  val e1 = e0.reduce(_ + _)

  val e2 = in Vec(UInt(8 bits),4)
  val e3 = e2.reduce(_ + _).asOutput()
  val e4 = e2.reduceBalancedTree(_ + _,(i,j) => if(j == 1) RegNext(i) else i).asOutput()

  val f0 = in Vec(UInt(8 bits), 4)
  val f1 = out Vec(UInt(8 bits), 4)
  val f2 = out Vec(UInt(8 bits), 4)
  val f3 = out Vec(UInt(8 bits), 4)
  f1.assignFromBits(f0.reduceBalancedTree(_ @@ _).asBits)
  f2.assignFromBits(f0.reverse.reduceBalancedTree(_ @@ _).asBits)
  f3.assignFromBits(f0.asBits)
}
