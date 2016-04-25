package com.neroyang.leban

import org.scalatra.ScalatraServlet
import slick.jdbc.JdbcBackend.Database
import slick.driver.H2Driver.api._
import dbslick_huodong.Tables.Person

class ApiServlet extends ScalatraServlet {
  post("/baoming") {
    val newperson = Map("id" -> 1,
      "myschool" -> params("Myschool"),
      "myname" -> params("Myname"),
      "mynum" -> params("Mynum"),
      "mysex" -> params("Mysex"),
      "mywechat" -> params("Mywechat"),
      "date1" -> params("date1"),
      "date2" -> params("date2"),
      "date3" -> params("date3"),
      "masterword" -> params("Masterword"),
      "servantword" -> params("Servantword"),
      "matchid" -> 0)
    Database
      .forConfig("h2mem1")
      .run(Person
        .map(p =>
          (p.id, p.myschool, p.myname, p.mynum, p.mysex, p.mywechat, p.date1, p.date2, p.date3, p.masterword, p.servantword, p.matchid)) +=(newperson.get("id"), newperson.get("myschool"), newperson.get("myname"), newperson.get("mynum"), newperson.get("mysex"), newperson.get("mywechat"), newperson.get("date1"), newperson.get("date2"), newperson.get("date3"), newperson.get("masterword"), newperson.get("servantword"), newperson.get("matchid")))
  }

}
