package dbslick_huodong
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = slick.driver.MySQLDriver
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: slick.driver.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Person.schema
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Entity class storing rows of table Person
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param myschool Database column Myschool SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param myname Database column Myname SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param mynum Database column Mynum SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param mysex Database column Mysex SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param mywechat Database column Mywechat SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param date1 Database column date1 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param date2 Database column date2 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param date3 Database column date3 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param masterword Database column Masterword SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param servantword Database column Servantword SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param matchid Database column matchid SqlType(INT), Default(None) */
  case class PersonRow(id: Int, myschool: Option[String] = None, myname: Option[String] = None, mynum: Option[String] = None, mysex: Option[String] = None, mywechat: Option[String] = None, date1: Option[String] = None, date2: Option[String] = None, date3: Option[String] = None, masterword: Option[String] = None, servantword: Option[String] = None, matchid: Option[Int] = None)
  /** GetResult implicit for fetching PersonRow objects using plain SQL queries */
  implicit def GetResultPersonRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[Int]]): GR[PersonRow] = GR{
    prs => import prs._
    PersonRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Int]))
  }
  /** Table description of table person. Objects of this class serve as prototypes for rows in queries. */
  class Person(_tableTag: Tag) extends Table[PersonRow](_tableTag, "person") {
    def * = (id, myschool, myname, mynum, mysex, mywechat, date1, date2, date3, masterword, servantword, matchid) <> (PersonRow.tupled, PersonRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), myschool, myname, mynum, mysex, mywechat, date1, date2, date3, masterword, servantword, matchid).shaped.<>({r=>import r._; _1.map(_=> PersonRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column Myschool SqlType(VARCHAR), Length(32,true), Default(None) */
    val myschool: Rep[Option[String]] = column[Option[String]]("Myschool", O.Length(32,varying=true), O.Default(None))
    /** Database column Myname SqlType(VARCHAR), Length(32,true), Default(None) */
    val myname: Rep[Option[String]] = column[Option[String]]("Myname", O.Length(32,varying=true), O.Default(None))
    /** Database column Mynum SqlType(VARCHAR), Length(32,true), Default(None) */
    val mynum: Rep[Option[String]] = column[Option[String]]("Mynum", O.Length(32,varying=true), O.Default(None))
    /** Database column Mysex SqlType(VARCHAR), Length(32,true), Default(None) */
    val mysex: Rep[Option[String]] = column[Option[String]]("Mysex", O.Length(32,varying=true), O.Default(None))
    /** Database column Mywechat SqlType(VARCHAR), Length(32,true), Default(None) */
    val mywechat: Rep[Option[String]] = column[Option[String]]("Mywechat", O.Length(32,varying=true), O.Default(None))
    /** Database column date1 SqlType(VARCHAR), Length(32,true), Default(None) */
    val date1: Rep[Option[String]] = column[Option[String]]("date1", O.Length(32,varying=true), O.Default(None))
    /** Database column date2 SqlType(VARCHAR), Length(32,true), Default(None) */
    val date2: Rep[Option[String]] = column[Option[String]]("date2", O.Length(32,varying=true), O.Default(None))
    /** Database column date3 SqlType(VARCHAR), Length(32,true), Default(None) */
    val date3: Rep[Option[String]] = column[Option[String]]("date3", O.Length(32,varying=true), O.Default(None))
    /** Database column Masterword SqlType(VARCHAR), Length(32,true), Default(None) */
    val masterword: Rep[Option[String]] = column[Option[String]]("Masterword", O.Length(32,varying=true), O.Default(None))
    /** Database column Servantword SqlType(VARCHAR), Length(32,true), Default(None) */
    val servantword: Rep[Option[String]] = column[Option[String]]("Servantword", O.Length(32,varying=true), O.Default(None))
    /** Database column matchid SqlType(INT), Default(None) */
    val matchid: Rep[Option[Int]] = column[Option[Int]]("matchid", O.Default(None))

  }
      /** Collection-like TableQuery object for table Person */
  lazy val Person = new TableQuery(tag => new Person(tag))
}
