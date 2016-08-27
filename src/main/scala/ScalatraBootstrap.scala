import net.braysoft.landlord._
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new LandLordServlet, "/*")
    
    context.mount(new UsersServlet, "/users/*")
  }
}
