package net.braysoft.landlord

import org.scalatra._

class LandLordServlet extends RateMyLandlordStack {

  get("/") {
    <html>
      <body>
        <h1>Sup, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
