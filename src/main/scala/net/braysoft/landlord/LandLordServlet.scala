package net.braysoft.landlord

import org.scalatra._

class LandLordServlet extends RateMyLandlordStack {

  get("/") {
    <html>
      <body>
        <h1>Sup, world!</h1>
        Say <a href="sup">hello to Scalate</a>.
      </body>
    </html>
  }
  
  get("/sup") {
    <html>
      <body>
        <h1>Esto es una movida!</h1>
      </body>
    </html>
  }

}
