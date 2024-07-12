package DemoRamRom

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

object DemoRamRomMain extends App {
  SpinalConfig(targetDirectory =
    "rtl/DemoRamRom"
  ).generateVerilog(new DemoRamRom)
}
