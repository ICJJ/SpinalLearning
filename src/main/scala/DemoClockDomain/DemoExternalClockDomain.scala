package DemoClockDomain

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

class External1 extends Component{

  val clkDomain = ClockDomain.external("ext")

  val clkArea = new ClockingArea(clkDomain){
    val a0 = in UInt(8 bits)
    val a1 = RegNext(a0) init(0)
  }
}
class External2 extends Component{

  val ext1 = new External1

}


class DemoExternalClockDomain extends Component {

  val ext2 = new External2
}
