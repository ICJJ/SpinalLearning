package DemoClockDomain

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

object DemoClockDomainMain extends App {
  SpinalConfig(targetDirectory =
    "rtl/DemoClockDomain"
//    ,removePruned = true
  ).generateVerilog(new DemoClockDomain)

  SpinalConfig(targetDirectory =
    "rtl/DemoClockDomain"
//    ,removePruned = true
  ).generateVerilog(new DemoInternalClockDomain)

  SpinalConfig(targetDirectory =
    "rtl/DemoClockDomain"
//    ,removePruned = true
  ).generateVerilog(new DemoExternalClockDomain)
}
