package DemoWhen

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

class DemoWhen extends Component {

  /** when - if */
  val a0 = in Bool()
  val a1 = out Bits(5 bits)
  when(a0){
    a1 := 3
  } otherwise{
    a1 := 4
  }


  val b0 = in Bool()
  val b1 = out (Reg(Bits(5 bits)))
  when(b0){
    b1 := 3
  } otherwise{
    b1 := 4
  }

  val c0 = in Bits(2 bits)
  val c1 = out (Reg(Bits(5 bits)))
  when(c0 === 0) {
    c1 := 0
  } elsewhen(c0 === 1) {
    c1 := 1
  } elsewhen(c0 === 2) {
    c1 := 2
  } otherwise {
    c1 := 5
  }

  val d0 = in Bool()
  val d1 = out (Reg(Bits(5 bits)))
  when(d0){
    d1 := 3
  }
  .otherwise{
    d1 := 4
  }




}
