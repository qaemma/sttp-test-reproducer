import com.softwaremill.sttp.SttpBackend
import com.softwaremill.sttp.okhttp.OkHttpFutureBackend
import com.softwaremill.sttp.testing.{ConvertToFuture, HttpTest}

import scala.concurrent.Future

class OkHttpBackendTest extends HttpTest[Future]{
  override implicit val backend: SttpBackend[Future, Nothing] = OkHttpFutureBackend()
  override implicit val convertToFuture: ConvertToFuture[Future] = ConvertToFuture.future
}
