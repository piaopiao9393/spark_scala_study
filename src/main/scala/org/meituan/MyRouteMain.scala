package org.meituan

import org.apache.camel.main.Main
import org.apache.camel.scala.dsl.builder.RouteBuilderSupport
import org.apache.spark.{SparkConf, SparkContext}
/**
 * A Main to run Camel with MyRouteBuilder
 */
object MyRouteMain  {

  def main(args: Array[String]) {
//    val main = new Main()
//    // create the CamelContext
//    val context = main.getOrCreateCamelContext()
//    // add our route using the created CamelContext
//    main.addRouteBuilder(new MyRouteBuilder(context))
//    // must use run to start the main application
//    main.run()

    val conf = new SparkConf().setMaster("local").setAppName("HelloWorld")

    val sc = new SparkContext(conf)

    val helloWorld = sc.parallelize(List("Hello,World!","Hello,Spark!","Hello,BigData!"))

    helloWorld.foreach(line => println(line))
  }
}

