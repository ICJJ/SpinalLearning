package DemoBool

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

class DemoBool extends Component{
  val a = Bool()
  val b = Bool()
  val c = True
  val d = Bool(1 > 2)

  val e = a && b
  val f = a || b
  val g = a ^ b
  val h = !a
///////////////////////////////////
  val aa = Bool()
  aa.set()

  val bb = Bool()
  bb.clear()

  val cc = Bool()
  cc.clear()
  cc.setWhen(aa)

  val dd = Bool()
  dd.clear()
  when(bb.edge(cc)){
    dd := True
  }

  val ee = Bool()
  ee.clear()
  when(cc.fall(dd)){
    ee := True
  }

  val ff = ee.edges()

  val aaa = Bool()
  aaa.clear()
  when(a===b){
    aaa := True
  }

  val bbb = Bool()
  bbb.clear()
  when(a=/=b){
    bbb := True
  }

  val ccc = a ## b
  val ddd = a #* 5

}
