package com.bscllc

sealed trait Conf

case class Port(number: Int) extends Conf

case class MyConfig(server: String, port: Int, title: String) extends Conf

case class EdwinConfig(server: String, port: Int, title: String) extends Conf

case class Goober(gooberConfig: GooberConfig)

case class GooberConfig(details: Map[String, String]) extends Conf

//case class MapDetails(details: Map[String, String])
