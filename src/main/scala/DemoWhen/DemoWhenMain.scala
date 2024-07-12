package DemoWhen

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

object DemoWhenMain extends App {
  SpinalConfig(targetDirectory = "rtl/DemoWhen"
  ).generateVerilog(new DemoWhen)
}
