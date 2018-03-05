
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/lab3/conf/routes
// @DATE:Mon Mar 05 11:59:42 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
