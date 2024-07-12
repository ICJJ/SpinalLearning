package DemoFifo

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

class DemoFifo extends Component {
    val x = slave Stream(UInt(8 bits))
    val y = master Stream(UInt(8 bits))

    x.queue(4) >> y // the queue function create a fifo module
}
