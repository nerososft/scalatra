import com.neroyang.leban._
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new ApiServlet, "/Api/*")
  }
}
