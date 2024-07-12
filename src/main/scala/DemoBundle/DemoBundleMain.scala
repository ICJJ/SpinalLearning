package DemoBundle

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

object DemoBundleMain extends App {
  SpinalConfig(
    targetDirectory = "rtl/DemoBundle"
  ).generateVerilog(new DemoBundle)
}
