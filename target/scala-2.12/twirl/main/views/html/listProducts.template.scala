
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import models.products.Category
/*2.2*/import models.products.Product
/*3.2*/import models.users.User

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[Product],List[Category],User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(products: List[Product], categories: List[Category], user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.93*/("""


"""),_display_(/*7.2*/main("Products",user)/*7.23*/ {_display_(Seq[Any](format.raw/*7.25*/("""

"""),format.raw/*9.1*/("""<p class="lead">Product Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*15.17*/routes/*15.23*/.ProductCtrl.listProducts(0)),format.raw/*15.51*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*16.8*/for(c <- categories) yield /*16.28*/ {_display_(Seq[Any](format.raw/*16.30*/("""
        """),format.raw/*17.9*/("""<a href=""""),_display_(/*17.19*/routes/*17.25*/.ProductCtrl.listProducts(c.getId)),format.raw/*17.59*/("""" class="list-group-item">"""),_display_(/*17.86*/c/*17.87*/.getName),format.raw/*17.95*/("""
          """),format.raw/*18.11*/("""<span class="badge">"""),_display_(/*18.32*/c/*18.33*/.getProducts.size()),format.raw/*18.52*/("""</span>
        </a>
      """)))}),format.raw/*20.8*/("""
    """),format.raw/*21.5*/("""</div>
  </div>
  <div class="col-sm-10">
      """),_display_(/*24.8*/if(flash.containsKey("success"))/*24.40*/ {_display_(Seq[Any](format.raw/*24.42*/("""
        """),format.raw/*25.9*/("""<div class="alert alert-success">
          """),_display_(/*26.12*/flash/*26.17*/.get("success")),format.raw/*26.32*/("""
        """),format.raw/*27.9*/("""</div>
      """)))}),format.raw/*28.8*/("""

    """),format.raw/*30.5*/("""<div id="actions">
      <form action=""""),_display_(/*31.22*/routes/*31.28*/.ProdutCtrl.listProducts(catId)),format.raw/*31.59*/("""" method="GET">
        <input type="search" id="searchbox" name="filter" placeholder="Search...">
        <input type="search" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
      </form>
    </div>

    <table class="table table-bordered table-hover table-condensed">   
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Category</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>   
        </tr>
      </thead>

      <tbody>
        """),_display_(/*50.10*/for(p<-products) yield /*50.26*/ {_display_(Seq[Any](format.raw/*50.28*/("""
          """),format.raw/*51.11*/("""<tr>
              """),_display_(/*52.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*52.104*/ {_display_(Seq[Any](format.raw/*52.106*/("""
                """),format.raw/*53.17*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*53.72*/(p.getId + ".jpg")),format.raw/*53.90*/(""""/></td>
            """)))}/*54.15*/else/*54.20*/{_display_(Seq[Any](format.raw/*54.21*/("""
                """),format.raw/*55.17*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*56.14*/("""
            """),format.raw/*57.13*/("""<td class="numeric">"""),_display_(/*57.34*/p/*57.35*/.getId),format.raw/*57.41*/("""</td>
            <td><a href=""""),_display_(/*58.27*/routes/*58.33*/.ProductCtrl.productDetails(p.getId)),format.raw/*58.69*/("""">
                """),_display_(/*59.18*/p/*59.19*/.getName),format.raw/*59.27*/("""</td>
               </a>     
            <td>"""),_display_(/*61.18*/p/*61.19*/.getDescription),format.raw/*61.34*/("""</td>
            <td  class="numeric">"""),_display_(/*62.35*/p/*62.36*/.getStock),format.raw/*62.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*63.37*/("%.2f".format(p.getPrice))),format.raw/*63.64*/("""</td>
          
          </tr>
        """)))}),format.raw/*66.10*/("""
      """),format.raw/*67.7*/("""</tbody>

    </table>
  </div>
</div>
""")))}))
      }
    }
  }

  def render(products:List[Product],categories:List[Category],user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[Product],List[Category],User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 05 11:59:41 GMT 2018
                  SOURCE: /media/sf_student/lab3/app/views/listProducts.scala.html
                  HASH: c9d9bbdc55a2f4482a26256bc622c21d9abbfb4e
                  MATRIX: 651->1|690->34|728->66|1112->92|1298->183|1327->187|1356->208|1395->210|1423->212|1605->367|1620->373|1669->401|1747->453|1783->473|1823->475|1859->484|1896->494|1911->500|1966->534|2020->561|2030->562|2059->570|2098->581|2146->602|2156->603|2196->622|2254->650|2286->655|2361->704|2402->736|2442->738|2478->747|2550->792|2564->797|2600->812|2636->821|2680->835|2713->841|2780->881|2795->887|2847->918|3407->1451|3439->1467|3479->1469|3518->1480|3565->1500|3663->1588|3704->1590|3749->1607|3831->1662|3870->1680|3911->1703|3924->1708|3963->1709|4008->1726|4126->1813|4167->1826|4215->1847|4225->1848|4252->1854|4311->1886|4326->1892|4383->1928|4430->1948|4440->1949|4469->1957|4544->2005|4554->2006|4590->2021|4657->2061|4667->2062|4697->2071|4766->2113|4814->2140|4887->2182|4921->2189
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|41->9|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|62->30|63->31|63->31|63->31|82->50|82->50|82->50|83->51|84->52|84->52|84->52|85->53|85->53|85->53|86->54|86->54|86->54|87->55|88->56|89->57|89->57|89->57|89->57|90->58|90->58|90->58|91->59|91->59|91->59|93->61|93->61|93->61|94->62|94->62|94->62|95->63|95->63|98->66|99->67
                  -- GENERATED --
              */
          