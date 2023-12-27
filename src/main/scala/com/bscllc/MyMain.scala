package com.bscllc

import pureconfig.ConfigSource
import pureconfig.generic.auto._

object MyMain {
  def main(args: Array[String]): Unit = {
    val config = ConfigSource.default.loadOrThrow[MyConfig]

    println(config)

    val econfig = ConfigSource.default.loadOrThrow[EdwinConfig]

    println(econfig)

    val goober = ConfigSource.resources("map.conf").loadOrThrow[Goober]
    println(goober)
    println(s"The keys: ${goober.gooberConfig.details.keys}")

    goober.gooberConfig.details.keys.foreach( key => println(s"${key}: ${goober.gooberConfig.details.get(key).get}"))
  }

}
