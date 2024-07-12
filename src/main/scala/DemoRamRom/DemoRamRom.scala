package DemoRamRom

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

class DemoRamRom extends Component {

  val io = new Bundle{
    val addr = in UInt(log2Up(2048) bits)
    val en = in Bool()
    val dataIn = in UInt(5 bits)
    val dataOut = out UInt(5 bits)
    val mask = in Bits(5 bits)
  }

  noIoPrefix()
  val mem = Mem(UInt(5 bits),2048).addAttribute("ram_style = \"block\"")
  mem.write(io.addr,io.dataIn,io.en,io.mask)
  io.dataOut := mem.readSync(io.addr,io.en)
//  io.dataOut := mem.readAsync(io.addr)

}
