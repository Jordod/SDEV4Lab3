
package views.html.productAdmin

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
/*2.2*/import models.products.Category
/*3.2*/import models.products.Product
/*4.2*/import models.users.User

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[List[Product],List[Category],Long,String,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(products: List[Product], categories: List[Category], catId: Long, filter: String,  user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.123*/("""

"""),_display_(/*7.2*/main("Products",user)/*7.23*/ {_display_(Seq[Any](format.raw/*7.25*/("""

"""),format.raw/*9.1*/("""<p class="lead">Product Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-3">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*15.17*/routes/*15.23*/.AdminProductCtrl.listProducts(0, filter)),format.raw/*15.64*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*16.8*/for(c <- categories) yield /*16.28*/ {_display_(Seq[Any](format.raw/*16.30*/("""
        """),format.raw/*17.9*/("""<a href=""""),_display_(/*17.19*/routes/*17.25*/.AdminProductCtrl.listProducts(c.getId, filter)),format.raw/*17.72*/("""" class="list-group-item">"""),_display_(/*17.99*/c/*17.100*/.getName),format.raw/*17.108*/("""
          """),format.raw/*18.11*/("""<span class="badge">"""),_display_(/*18.32*/c/*18.33*/.getProducts.size()),format.raw/*18.52*/("""</span>
        </a>
      """)))}),format.raw/*20.8*/("""
    """),format.raw/*21.5*/("""</div>
  </div>
  <div class="col-sm-9">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*25.8*/if(flash.containsKey("success"))/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/("""
        """),format.raw/*26.9*/("""<div class="alert alert-success">
          """),_display_(/*27.12*/flash/*27.17*/.get("success")),format.raw/*27.32*/("""
        """),format.raw/*28.9*/("""</div>
      """)))}),format.raw/*29.8*/("""
      """),format.raw/*30.7*/("""<thead>
        <tr>
          <th>Image</th>
          <th>ID</th>
          <th>Name</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*43.10*/for(p<-products) yield /*43.26*/ {_display_(Seq[Any](format.raw/*43.28*/("""
          """),format.raw/*44.11*/("""<tr>
              """),_display_(/*45.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*45.104*/ {_display_(Seq[Any](format.raw/*45.106*/("""
                """),format.raw/*46.17*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*46.72*/(p.getId + ".jpg")),format.raw/*46.90*/(""""/></td>
            """)))}/*47.15*/else/*47.20*/{_display_(Seq[Any](format.raw/*47.21*/("""
                """),format.raw/*48.17*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*49.14*/("""
            """),format.raw/*50.13*/("""<td class="numeric">"""),_display_(/*50.34*/p/*50.35*/.getId),format.raw/*50.41*/("""</td>
            <td><a href=""""),_display_(/*51.27*/routes/*51.33*/.ProductCtrl.productDetails(p.getId)),format.raw/*51.69*/("""">
             """),_display_(/*52.15*/p/*52.16*/.getName),format.raw/*52.24*/("""</td>
            </a>
     
            <td>"""),_display_(/*55.18*/p/*55.19*/.getDescription),format.raw/*55.34*/("""</td>
            <td  class="numeric">"""),_display_(/*56.35*/p/*56.36*/.getStock),format.raw/*56.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*57.37*/("%.2f".format(p.getPrice))),format.raw/*57.64*/("""</td>
            <td>
              <a href=""""),_display_(/*59.25*/routes/*59.31*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*59.71*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*63.25*/routes/*63.31*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*63.71*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*68.10*/("""
      """),format.raw/*69.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*74.17*/routes/*74.23*/.AdminProductCtrl.addProduct()),format.raw/*74.53*/("""">
        <button class="btn btn-primary">Add a product</button>
      </a>
    </p>
  </div>
</div>
""")))}))
      }
    }
  }

  def render(products:List[Product],categories:List[Category],catId:Long,filter:String,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,catId,filter,user,env)

  def f:((List[Product],List[Category],Long,String,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,catId,filter,user,env) => apply(products,categories,catId,filter,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 05 11:59:42 GMT 2018
                  SOURCE: /media/sf_student/lab3/app/views/productAdmin/listProducts.scala.html
                  HASH: c915b1f3fc81ae0cfcc2e42e264811f6a1d5b90e
                  MATRIX: 664->2|703->35|741->67|1137->93|1354->214|1382->217|1411->238|1450->240|1478->242|1660->397|1675->403|1737->444|1815->496|1851->516|1891->518|1927->527|1964->537|1979->543|2047->590|2101->617|2112->618|2142->626|2181->637|2229->658|2239->659|2279->678|2337->706|2369->711|2512->828|2553->860|2593->862|2629->871|2701->916|2715->921|2751->936|2787->945|2831->959|2865->966|3156->1230|3188->1246|3228->1248|3267->1259|3314->1279|3412->1367|3453->1369|3498->1386|3580->1441|3619->1459|3660->1482|3673->1487|3712->1488|3757->1505|3875->1592|3916->1605|3964->1626|3974->1627|4001->1633|4060->1665|4075->1671|4132->1707|4176->1724|4186->1725|4215->1733|4288->1779|4298->1780|4334->1795|4401->1835|4411->1836|4441->1845|4510->1887|4558->1914|4632->1961|4647->1967|4708->2007|4905->2177|4920->2183|4981->2223|5201->2412|5235->2419|5310->2467|5325->2473|5376->2503
                  LINES: 24->2|25->3|26->4|31->5|36->5|38->7|38->7|38->7|40->9|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|51->20|52->21|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|60->29|61->30|74->43|74->43|74->43|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|80->49|81->50|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|90->59|90->59|90->59|94->63|94->63|94->63|99->68|100->69|105->74|105->74|105->74
                  -- GENERATED --
              */
          