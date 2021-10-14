package controllers;

import spark.ModelAndView;
import spark.Response;
import spark.Request;

public class SaludoController {
  public ModelAndView bienvenida(Request request, Response response) {
    return new ModelAndView(request.queryParamOrDefault("nombre", "Nini"),
                                              "bienvenida.html.hbs");
  }

  public ModelAndView despedida(Request request, Response response) {
    return new ModelAndView(request.queryParamOrDefault("nombre", "Nini"),
        "despedida.html.hbs");
  }

}
