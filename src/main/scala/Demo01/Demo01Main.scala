package Demo01

import spinal.core._

object Demo01Main {
  def  main(args: Array[String]): Unit = {
    SpinalConfig(
      targetDirectory = "rtl/Demo01"
    ).generateVerilog(new Demo01)

    SpinalConfig(
      targetDirectory = "rtl/Demo01",
      genVhdlPkg = false
    ).generateVhdl(new Demo01)

    SpinalConfig(
      targetDirectory = "rtl/Demo01"
    ).generateSystemVerilog(new Demo01)
  }

}
