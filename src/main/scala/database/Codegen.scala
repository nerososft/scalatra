package database
/**
  * Created by neroyang on 16-4-25.
  */
object Codegen{
  def main(args: Array[String]) {
    slick.codegen.SourceCodeGenerator.main(
      Array[String]("slick.driver.MySQLDriver",
        "com.mysql.jdbc.Driver",
        "jdbc:mysql://localhost:3306/huodong",
        "src/main/scala",
        "dbslick_huodong",
        "root",
        "baby520587"
      )
    )
  }
}