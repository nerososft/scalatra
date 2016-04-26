package com.neroyang.leban

import java.sql.DriverManager

import slick.driver.H2Driver.api._
import org.scalatra.ScalatraServlet
import slick.jdbc.JdbcBackend.Database
import dbslick_huodong.Tables.Person
import org.slf4j.LoggerFactory

import scala.concurrent._
import ExecutionContext.Implicits.global

class ApiServlet extends ScalatraServlet {
  val logger =  LoggerFactory.getLogger(getClass)
  post("/baoming") {
    //    val newperson = Map("id" -> 1,
    //      "myschool" -> params("Myschool"),
    //      "myname" -> params("Myname"),
    //      "mynum" -> params("Mynum"),
    //      "mysex" -> params("Mysex"),
    //      "mywechat" -> params("Mywechat"),
    //      "date1" -> params("date1"),
    //      "date2" -> params("date2"),
    //      "date3" -> params("date3"),
    //      "masterword" -> params("Masterword"),
    //      "servantword" -> params("Servantword"),
    //      "matchid" -> 0)

    val f = Database
      .forConfig("mysql1")
      .run(Person.result)
    f onSuccess {
      case lists => println(lists)
    }
    //    val list = Database
    //          .forConfig("mysql1")
    //          .run(Person.result)
    //        println(list)
  }
}
